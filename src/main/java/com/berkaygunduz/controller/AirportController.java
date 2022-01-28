package com.berkaygunduz.controller;

import com.berkaygunduz.dto.AirportDTO;
import com.berkaygunduz.service.AirportsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/airports")
public class AirportController {

    @Autowired
    AirportsService airportsService;

    public AirportController(AirportsService airportsService){
        this.airportsService=airportsService;
    }

    @GetMapping
    public ResponseEntity<List<AirportDTO>> getAllAirportList(){
        return ResponseEntity.ok(airportsService.getAll());
    }

    @RequestMapping(value = "/type", method = RequestMethod.GET)
    public ResponseEntity<List<AirportDTO>> getAllAirportsByType(@RequestParam(value = "type") String type){
        return ResponseEntity.ok(airportsService.getAirportsByType(type));
    }

    @GetMapping("/{id}")
    public ResponseEntity<AirportDTO> getAirportById(@PathVariable("id") int id){
        return ResponseEntity.ok(airportsService.getAirportById(id));
    }
    @RequestMapping(value = "/getAirportsRunwaysByCountryCode", method = RequestMethod.GET)
    public ResponseEntity<List<AirportDTO>> getAirportsRunwaysByCountryCode(@RequestParam(value = "iso_country" )String iso_country){
        return ResponseEntity.ok(airportsService.getAirportsRunwaysByCountryCode(iso_country));
    }

}
