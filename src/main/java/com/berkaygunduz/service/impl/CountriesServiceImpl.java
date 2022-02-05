package com.berkaygunduz.service.impl;

import com.berkaygunduz.dto.CountriesDTO;
import com.berkaygunduz.entity.Countries;
import com.berkaygunduz.repository.CountriesRepo;
import com.berkaygunduz.service.CountriesService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@RequiredArgsConstructor
public class CountriesServiceImpl implements CountriesService {

    @Autowired
    private final CountriesRepo countriesRepo;

    @Override
    public List<CountriesDTO> getAll() {
        return null;
    }

    @Override
    public List<CountriesDTO> getCountriesByCode(String code,String name) {
        List<Countries> countriesList = countriesRepo.findByCodeOrName(code,name);
        List<CountriesDTO> countriesDTOList = new ArrayList<>();
        countriesList.forEach(it -> {
            CountriesDTO countriesDTO = new CountriesDTO();
            countriesDTO.setCode(it.getCode());
            countriesDTO.setName(it.getName());
            countriesDTO.setContinent(it.getContinent());
            countriesDTO.setId(it.getId());
            countriesDTOList.add(countriesDTO);});

        return countriesDTOList;
    }

    @Override
    public List<CountriesDTO> getTopTenCountry() {
        List<Countries> countriesList = countriesRepo.findAll();
        Collections.sort(countriesList,((o1, o2) -> o1.getAirports().size() - o2.getAirports().size()));
        Collections.reverse(countriesList);
        List<CountriesDTO> countriesDTOList = new ArrayList<>();
        countriesList.stream().limit(10).forEach(it -> {
            CountriesDTO countriesDTO = new CountriesDTO();
            countriesDTO.setCode(it.getCode());
            countriesDTO.setName(it.getName());
            countriesDTO.setContinent(it.getContinent());
            countriesDTO.setId(it.getId());
//            countriesDTO.setAirports(it.getAirports());
            countriesDTOList.add(countriesDTO);
        });


        return countriesDTOList;
    }

    @Override
    public CountriesDTO getCountriesBonus(String codeOrName) {
        Countries countries = countriesRepo.findAll().stream().filter(it->it.getCode().equalsIgnoreCase(codeOrName)).findAny()
                .orElse(countriesRepo.findAll().stream().filter(oy->oy.getName().toLowerCase().contains(codeOrName.toLowerCase())).findAny()
                        .orElse(countriesRepo.findAll().stream().filter(iy->iy.getName().equalsIgnoreCase(codeOrName)).findAny().orElse(null)));
        CountriesDTO countriesDTO = new CountriesDTO();
        countriesDTO.setId(countries.getId());
        countriesDTO.setContinent(countries.getContinent());
        countriesDTO.setName(countries.getName());
        countriesDTO.setCode(countries.getCode());
        countriesDTO.setAirports(countries.getAirports());
        return countriesDTO;
    }

}
