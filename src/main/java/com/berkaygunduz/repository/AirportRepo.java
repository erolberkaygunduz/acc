package com.berkaygunduz.repository;

import com.berkaygunduz.entity.Airports;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AirportRepo extends JpaRepository<Airports,Integer> {

}
