package com.berkaygunduz.entity;


import com.berkaygunduz.dto.AirportDTO;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(includeFieldNames=true)
@Table(name = "airports")
public class Airports extends AirportDTO implements Serializable {

//    //@JsonManagedReference(value = "airportToCountry")
//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "iso_country")
//    private Countries countries;

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "airport_ref")
    private List<Runways> runways;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "ident")
    private String ident;
    @Column(name = "type")
    private String type;
    @Column(name = "name")
    private String name;
    @Column(name = "latitude_deg")
    private Double latitude_deg;
    @Column(name = "longitude_deg")
    private Double longitude_deg;
    @Column(name = "elevation_ft")
    private Integer elevation_ft;
    @Column(name = "continent")
    private String continent;
    @Column(name = "iso_country")
    private String iso_country;
    @Column(name = "iso_region")
    private String iso_region;
    @Column(name = "municipality")
    private String municipality;
    @Column(name = "scheduled_service")
    private String scheduled_service;
    @Column(name = "gps_code")
    private String gps_code;
    @Column(name = "iata_code")
    private String iata_code;
    @Column(name = "local_code")
    private String local_code;
    @Column(name = "home_link")
    private String home_link;
    @Column(name = "wikipedia_link")
    private String wikipedia_link;
    @Column(name = "keywords")
    private String keywords;


}

