package com.berkaygunduz.service;

import com.berkaygunduz.dto.CountriesDTO;
import com.berkaygunduz.entity.Countries;

import java.util.List;

public interface CountriesService {

    List<CountriesDTO> getAll();

    CountriesDTO getCountriesByCode(String code);

    List<CountriesDTO> getTopTenCountry();

    CountriesDTO getCountriesBonus(String codeOrName);
}