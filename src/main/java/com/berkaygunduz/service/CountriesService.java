package com.berkaygunduz.service;

import com.berkaygunduz.dto.CountriesDTO;

import java.util.List;

public interface CountriesService {

    List<CountriesDTO> getAll();

    List<CountriesDTO> getCountriesByCode(String code,String name);

    List<CountriesDTO> getTopTenCountry();

    CountriesDTO getCountriesBonus(String codeOrName);
}
