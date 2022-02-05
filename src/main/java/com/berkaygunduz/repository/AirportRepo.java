package com.berkaygunduz.repository;

import com.berkaygunduz.entity.Airports;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AirportRepo extends JpaRepository<Airports,Integer> {

    List<Airports> findAirportsByType (String type);

    List<Airports> findAirportsByIsocountry (String iso_country);

}
