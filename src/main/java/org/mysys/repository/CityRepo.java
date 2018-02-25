package org.mysys.repository;

import org.mysys.model.Citymaster;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityRepo extends JpaRepository<Citymaster, Long> {


}
