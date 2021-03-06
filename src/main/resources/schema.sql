create table countries
(
    id             INTEGER GENERATED by default as IDENTITY,
    code           VARCHAR(255),
    name           VARCHAR(255),
    continent      VARCHAR(255),
    wikipedia_link VARCHAR(255),
    keywords       VARCHAR(255),
    PRIMARY KEY (id)
) as
select *
from CSVREAD('classpath:/countries.csv');


CREATE TABLE airports
(
    id                INTEGER GENERATED by default as IDENTITY,
    ident             VARCHAR2(255),
    type              VARCHAR2(255),
    NAME              VARCHAR2(255),
    latitude_deg      DOUBLE,
    longitude_deg     double,
    elevation_ft      INTEGER,
    continent         VARCHAR2(255),
    iso_country       VARCHAR2(255),
    iso_region        VARCHAR2(255),
    municipality      VARCHAR2(255),
    scheduled_service VARCHAR2(255),
    gps_code          VARCHAR2(255),
    iata_code         VARCHAR2(255),
    local_code        VARCHAR2(255),
    home_link         VARCHAR2(255),
    wikipedia_link    VARCHAR2(255),
    keywords          VARCHAR2,
    primary key (id)
) as
select *
from CSVREAD('classpath:/airports.csv');

CREATE TABLE runways
(
    id                INTEGER GENERATED by default as IDENTITY,
    airport_ref               INTEGER,
    airport_ident             VARCHAR2,
    length_ft                 INTEGER,
    width_ft                  INTEGER,
    surface                   VARCHAR2,
    lighted                   boolean,
    closed                    boolean,
    le_ident                  VARCHAR2,
    le_latitude_deg           DOUBLE,
    le_longitude_deg          DOUBLE,
    le_elevation_ft           DOUBLE,
    le_heading_degt           DOUBLE,
    le_displaced_threshold_ft DOUBLE,
    he_ident                  VARCHAR2,
    he_latitude_deg           DOUBLE,
    he_longitude_deg          DOUBLE,
    he_elevation_ft           DOUBLE,
    he_heading_degt           DOUBLE,
    he_displaced_threshold_ft DOUBLE
) as
select *
from CSVREAD('classpath:/runways.csv');
