package com.codegym.repository;

import com.codegym.model.Country;
import com.codegym.model.dto.CountryDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CountryRepository extends JpaRepository<Country, Long> {
    @Query("SELECT NEW com.codegym.model.dto.CountryDTO (" +
            "c.id, " +
            "c.nameCountry )" +
            "FROM Country c ")
    List<CountryDTO> getAllCountryDTO();

}
