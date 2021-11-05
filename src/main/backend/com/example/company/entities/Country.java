package com.example.company.entities;

import com.example.company.dto.CountryDTO;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.sql.Date;
@Getter
@Setter
@Entity
@NoArgsConstructor
@Table(name = "country")
public class Country {
    @Id
    @Column(name = "idcountry")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "country_id_seq")
    @SequenceGenerator(name = "country_id_seq",sequenceName = "country_id_seq", allocationSize = 1)
    private Long idCountry;
    @Column(name = "countrycode",nullable = false,unique = true)
    private String countryCode;
    private String name;

    Country(CountryDTO countryDTO){
        this.idCountry = countryDTO.getIdCountry();
        this.countryCode = countryDTO.getCountryCode();
        this.name = countryDTO.getName();
    }

}
