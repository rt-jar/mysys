package org.mysys.web;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.mysys.model.Displist;
import org.mysys.service.ListingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.config.EnableSpringDataWebSupport;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@EnableSpringDataWebSupport
public class ListingController {
	private static final Log logger = LogFactory.getLog(ListingController.class);
	@Autowired
	private ListingService listingService;
	
	@GetMapping("/List")
	@ResponseBody
    public Displist fetchListMetadata(long id) {
		logger.info("Fetching List for "+ id);
		Displist dispList = listingService.loadMetadata(id).get();
        return dispList;
    }
	
	@GetMapping("/FetchData")
	@ResponseBody
    public Page<String[]> fetchData(long id,Pageable page) {
    	logger.info("Fetching data for "+ id);
		return listingService.getData(id,page);
    }
	
}
