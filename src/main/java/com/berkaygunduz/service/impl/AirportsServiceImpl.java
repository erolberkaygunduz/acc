package com.berkaygunduz.service.impl;

import com.berkaygunduz.dto.AirportDTO;
import com.berkaygunduz.dto.RunwaysDTO;
import com.berkaygunduz.entity.Airports;
import com.berkaygunduz.repository.AirportRepo;
import com.berkaygunduz.service.AirportsService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class AirportsServiceImpl implements AirportsService {

    @Autowired
    private final AirportRepo airportRepo;

    @Override
    public List<AirportDTO> getAll() {
        List<Airports> airportsList = airportRepo.findAll();
        List<AirportDTO> airportDTOS =new ArrayList<>();
        airportsList.forEach(it -> {
            AirportDTO airportDTO = new AirportDTO();
            airportDTO.setId(it.getId());
            airportDTO.setIdent(it.getIdent());
            airportDTO.setName(it.getName());
            airportDTO.setType(it.getType());
            airportDTO.setContinent(it.getContinent());
            airportDTO.setIso_country(it.getIso_country());
            airportDTO.setIso_region(it.getIso_region());
            airportDTO.setRunways(it.getRunways());
            airportDTOS.add(airportDTO);
        });

        return airportDTOS;
    }

    @Override
    public List<AirportDTO> getAirportsByType(String type) {
        List<Airports> airports = airportRepo.findAll().stream().filter(x->x.getType().equalsIgnoreCase(type)).collect(Collectors.toList());
        List<AirportDTO> airportDTOS = new ArrayList<>();
        airportDTOS.addAll(airports);

        return airportDTOS;
    }

    @Override
    public AirportDTO getAirportById(int id) {
        Airports airports = airportRepo.findById(id).orElse(null);
        AirportDTO airportDTO = new AirportDTO();
        airportDTO.setId(airports.getId());
        airportDTO.setType(airports.getType());
        airportDTO.setIdent(airports.getIdent());
        airportDTO.setContinent(airports.getContinent());
        airportDTO.setIso_country(airports.getIso_country());
        airportDTO.setIso_region(airports.getIso_region());
        airportDTO.setName(airports.getName());
        airportDTO.setRunways(airports.getRunways());
        return airportDTO;
    }

    @Override
    public List<AirportDTO> getAirportsRunwaysByCountryCode(String iso_country) {
        List<Airports> airports = airportRepo.findAll().stream().filter(it-> it.getIso_country().equalsIgnoreCase(iso_country)).collect(Collectors.toList());
        List<AirportDTO> airportDTOS = new ArrayList<>();
        airportDTOS.addAll(airports);
        return airportDTOS;
    }
}
