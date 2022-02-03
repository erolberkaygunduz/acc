package com.berkaygunduz.dto;

import com.berkaygunduz.entity.Runways;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AirportDTO {
    private Integer id;
    private String ident;
    private String type;
    private String name;
    private String continent;
    private String iso_country;
    private String iso_region;
    private List<Runways> runways;

}
