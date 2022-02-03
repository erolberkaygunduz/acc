package com.berkaygunduz.service;

import com.berkaygunduz.dto.AirportDTO;

import java.util.List;

public interface AirportsService {

    List<AirportDTO> getAll();

    List<AirportDTO> getAirportsByType(String type);

    AirportDTO getAirportById(int id);

    List<AirportDTO> getAirportsRunwaysByCountryCode(String iso_country);
}
