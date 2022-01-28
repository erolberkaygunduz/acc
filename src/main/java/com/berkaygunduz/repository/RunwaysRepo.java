package com.berkaygunduz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RunwaysRepo extends JpaRepository<com.berkaygunduz.entity.Runways,Integer> {
}
