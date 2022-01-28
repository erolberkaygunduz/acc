package com.berkaygunduz.dto;

import com.berkaygunduz.entity.Airports;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CountriesDTO {

    private Long id;
    private String code;
    private String name;
    private String continent;
    private List<Airports> airports;

}
