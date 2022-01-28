package com.berkaygunduz.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "runways")
public class Runways {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "airport_ref")
    private Integer airport_ref;
    @Column(name = "airport_ident")
    private String airport_ident;
    @Column(name = "length_ft")
    private Integer length_ft;
    @Column(name = "width_ft")
    private Integer width_ft;
    @Column(name = "surface")
    private String surface;
    @Column(name = "lighted")
    private Boolean lighted;
    @Column(name = "closed")
    private Boolean closed;
    @Column(name = "le_ident")
    private String le_ident;
    @Column(name = "le_latitude_deg")
    private Double le_latitude_deg;
    @Column(name = "le_longitude_deg")
    private Double le_longitude_deg;
    @Column(name = "le_elevation_ft")
    private Integer le_elevation_ft;
    @Column(name = "le_heading_degT")
    private Double le_heading_degT;
    @Column(name = "le_displaced_threshold_ft")
    private Integer le_displaced_threshold_ft;
    @Column(name = "he_ident")
    private String he_ident;
    @Column(name = "he_latitude_deg")
    private Double he_latitude_deg;
    @Column(name = "he_longitude_deg")
    private Double he_longitude_deg;
    @Column(name = "he_elevation_ft")
    private Integer he_elevation_ft;
    @Column(name = "he_heading_degT")
    private Double he_heading_degT;
    @Column(name = "he_displaced_threshold_ft")
    private Integer he_displaced_threshold_ft;
}

