package com.codegym.model;



import com.codegym.model.dto.CityDTO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import javax.persistence.*;


@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Accessors(chain = true)
@Entity
@Table(name = "cities")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String cityName;

    private Double area;

    private Long population;

    private Long gdp;

    private String description;



    @OneToOne
    @JoinColumn(name = "country_id")
    private Country country;

    public CityDTO toCityDTO() {
        return new CityDTO()
                .setId(id.toString())
                .setCityName(cityName)
                .setArea(String.valueOf(area))
                .setPopulation(population.toString())
                .setGdp(String.valueOf(gdp))
                .setDescription(description)
                .setCountry(country.toCountryDTO());
    }

}
