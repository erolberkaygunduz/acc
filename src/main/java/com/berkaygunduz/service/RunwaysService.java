package com.berkaygunduz.service;

import com.berkaygunduz.dto.AirportDTO;
import com.berkaygunduz.dto.RunwaysDTO;

import java.util.List;

public interface RunwaysService {

    List<RunwaysDTO> getAll();

    RunwaysDTO getRunwaysById(int id);
}
