package com.codegym.service.city;

import com.codegym.model.City;
import com.codegym.model.dto.CityDTO;
import com.codegym.service.IGeneralService;

import java.util.List;
import java.util.Optional;

public interface CityService extends IGeneralService<City> {
    List<CityDTO> getAllCityDTO();
    Optional<CityDTO> getCityDTOById(Long id);
    void deleteById(Long id);
}
