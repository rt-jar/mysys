package org.mysys.web;

import org.mysys.model.Citymaster;
import org.mysys.service.MasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MasterController {
	@Autowired
	private MasterService listingService;
	
	@GetMapping("/ListCityMaster")
	@ResponseBody
    public Page<Citymaster> fetchListMetadata(int pageNo, int pageSize) {
		return listingService.findPages(pageNo,pageSize); 
    }
	
}
