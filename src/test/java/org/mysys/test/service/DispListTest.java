package org.mysys.test.service;

import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mysys.config.MvcConfig;
import org.mysys.model.Displist;
import org.mysys.service.ListingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(classes = {MvcConfig.class})
public class DispListTest {

	@Autowired
	private ListingService listingService;
	
	
	@Test
	public void testListing(){
		Optional<Displist>  dispList = listingService.loadMetadata(12);
		assertThat(dispList.get(),notNullValue());
	}
}
