package com.berkaygunduz.controller;

import com.berkaygunduz.dto.AirportDTO;
import com.berkaygunduz.dto.CountriesDTO;
import com.berkaygunduz.service.CountriesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/countries")
public class CountriesController {

    @Autowired
    CountriesService countriesService;


    @RequestMapping(value = "/getCountriesByCode", method = RequestMethod.GET)
    public ResponseEntity<CountriesDTO> getCountriesByCode(@RequestParam(value = "codeOrName" )String codeOrName){
        return ResponseEntity.ok(countriesService.getCountriesByCode(codeOrName));
    }

    @GetMapping(value = "/getTopTenCountry")
    public ResponseEntity<List<CountriesDTO>> getTopTenCountry(){
        return ResponseEntity.ok(countriesService.getTopTenCountry());
    }

    @RequestMapping(value = "/getCountriesBonus", method = RequestMethod.GET)
    public ResponseEntity<CountriesDTO> getCountriesBonus(@RequestParam(value = "bonus" )String bonus){
        return ResponseEntity.ok(countriesService.getCountriesBonus(bonus));
    }
}
