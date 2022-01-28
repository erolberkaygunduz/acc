package com.berkaygunduz.service.impl;

import com.berkaygunduz.dto.AirportDTO;
import com.berkaygunduz.dto.RunwaysDTO;
import com.berkaygunduz.entity.Runways;
import com.berkaygunduz.repository.RunwaysRepo;
import com.berkaygunduz.service.RunwaysService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class RunwaysServiceImpl implements RunwaysService {

    @Autowired
    private final RunwaysRepo runwaysRepo;


    @Override
    public List<RunwaysDTO> getAll() {
        List<Runways> runwaysList = runwaysRepo.findAll();
        List<RunwaysDTO> runwaysDTOS =new ArrayList<>();
        runwaysList.forEach(it -> {
            RunwaysDTO dto = new RunwaysDTO();
            dto.setId(it.getId());
            dto.setAirport_ident(it.getAirport_ident());
            dto.setAirport_ref(it.getAirport_ref());
            runwaysDTOS.add(dto);
        });
        return runwaysDTOS;
    }


    @Override
    public RunwaysDTO getRunwaysById(int id) {
        Runways runways = runwaysRepo.findById(id).orElse(null);
        RunwaysDTO dto = new RunwaysDTO();
        dto.setId(runways.getId());
        dto.setAirport_ident(runways.getAirport_ident());
        dto.setAirport_ref(runways.getAirport_ref());

        return dto;
    }
}
