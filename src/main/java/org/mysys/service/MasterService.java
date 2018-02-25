package org.mysys.service;

import org.mysys.model.Citymaster;
import org.mysys.repository.CityRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class MasterService {

    @Autowired
    private CityRepo cityRepo;

    public Page<Citymaster> findPages(int pageNo,int pageSize){
      return cityRepo.findAll(PageRequest.of(pageNo, pageSize));
    }
}
