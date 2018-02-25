package org.mysys.repository;

import org.mysys.model.Displist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ListingRepo extends JpaRepository<Displist, Long> {
	

}
