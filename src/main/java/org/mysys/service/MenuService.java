package org.mysys.service;

import java.util.List;

import org.mysys.model.Module;
import org.mysys.repository.MenuRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MenuService {
	
	@Autowired
	MenuRepo menuRepo;
	
	public Module findMenu(long id){
		return menuRepo.findById(id);
	}
	
	public List<Module> findAll(){
		return menuRepo.findAll();
	}
}
