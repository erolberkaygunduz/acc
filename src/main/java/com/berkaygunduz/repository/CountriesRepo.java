package com.berkaygunduz.repository;

import com.berkaygunduz.entity.Countries;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountriesRepo extends JpaRepository<Countries,Integer> {

    List<Countries> findByCodeOrName (String code, String name);

}
