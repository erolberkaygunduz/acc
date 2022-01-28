package com.berkaygunduz.entity;

import lombok.*;
import org.hibernate.annotations.NaturalId;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "countries")
public class Countries implements java.io.Serializable {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NaturalId
    @Column(name = "code")
    private String code;
    @Column(name = "name")
    private String name;
    @Column(name = "continent")
    private String continent;
    @Column(name = "wikipedia_link")
    private String wikipedia_link;
    @Column(name = "keywords")
    private String keywords;


    @OneToMany(targetEntity = Airports.class, cascade = CascadeType.ALL)
    @JoinColumn(name = "iso_country", referencedColumnName = "code")
    private List<Airports> airports;
}
