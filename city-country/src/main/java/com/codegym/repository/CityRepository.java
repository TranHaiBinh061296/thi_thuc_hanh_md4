package com.codegym.repository;




import com.codegym.model.City;
import com.codegym.model.dto.CityDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface CityRepository extends JpaRepository<City, Long> {
    @Query("SELECT NEW com.codegym.model.dto.CityDTO (" +
            "c.id, " +
            "c.cityName ," +
            "c.area," +
            "c.population," +
            "c.gdp," +
            "c.description," +
            "c.country)" +
            "FROM City c ")
    List<CityDTO> getAllCityDTO();

    @Query("SELECT NEW com.codegym.model.dto.CityDTO (" +
            "c.id, " +
            "c.cityName ," +
            "c.area," +
            "c.population," +
            "c.gdp," +
            "c.description," +
            "c.country)" +
            "FROM City c " +
            "WHERE c.id = ?1")
    Optional<CityDTO> getCityDTOById(Long id);
}
