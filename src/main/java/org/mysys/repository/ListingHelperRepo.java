package org.mysys.repository;

import java.math.BigInteger;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.support.PageableExecutionUtils;
import org.springframework.stereotype.Repository;

@Repository
public class ListingHelperRepo{

	@PersistenceContext
	private EntityManager em;

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public Page<String[]> fetchData(String query,String countQuery,Map<String,Object> queryParam,Pageable page){
		Query q = em.createNativeQuery(query);
		Query cntQuery = em.createNativeQuery(countQuery);
		if(queryParam != null){
			Set<String> paramKey = queryParam.keySet();
			for(String param: paramKey){
				q.setParameter(param, queryParam.get(param));
				cntQuery.setParameter(param, queryParam.get(param));
			}
		}
		List countRslt = cntQuery.getResultList();
		if (page.isPaged()) {
			q.setFirstResult((int) page.getOffset());
			q.setMaxResults(page.getPageSize());
		}
		
		return PageableExecutionUtils.getPage(q.getResultList(), page, ()-> countNoOfRows(countRslt));




	}

	@SuppressWarnings("rawtypes")
	private long countNoOfRows(List result) {
		return result.size() == 1 ? ((BigInteger)result.get(0)).longValue() : result.size();
	}
}
