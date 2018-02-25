package org.mysys.service;

import java.util.Optional;

import org.mysys.model.Displist;
import org.mysys.model.Displistcol;
import org.mysys.repository.ListingHelperRepo;
import org.mysys.repository.ListingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class ListingService{

    @Autowired
    private ListingRepo dispList;
    @Autowired
    private ListingHelperRepo repo;
    
    public Optional<Displist> loadMetadata(long id){
    	return dispList.findById(id);
    }
    
    
    public Page<String[]> getData(long id,Pageable page){
    	Displist list = loadMetadata(id).get();
    	StringBuilder query =  new StringBuilder(" select "), countQuery = new StringBuilder(" select ");
    	if(list.getDisplistcols().isEmpty()){
    		query.append(" * ");
    	}else{
    		for(Displistcol col : list.getDisplistcols()){
        		query.append(col.getColumnname()).append(",");
        	}
    	}
    	
    	query.deleteCharAt(query.length()-1);
    	query.append(" from ").append(list.getTablename());
    	countQuery.append(" count(1) from ").append(list.getTablename());

    	return repo.fetchData(query.toString(),countQuery.toString(), null, page);
    }
    

}
