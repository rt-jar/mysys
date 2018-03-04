package org.mysys.repository;

import org.mysys.model.Module;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MenuRepo extends JpaRepository<Module, Long>{

	Module findById(long id);
	
}
