package com.codegym.service.city;


import com.codegym.model.City;
import com.codegym.model.dto.CityDTO;
import com.codegym.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CityServiceImpl implements CityService{

    @Autowired
    CityRepository cityRepository;

    @Override
    public List<City> findAll() {
        return null;
    }

    @Override
    public City getById(Long id) {
        return null;
    }

    @Override
    public Optional<City> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public City save(City city) {
        return cityRepository.save(city);
    }

    @Override
    public void remove(Long id) {

    }


    @Override
    public List<CityDTO> getAllCityDTO() {
        return cityRepository.getAllCityDTO();
    }

    @Override
    public Optional<CityDTO> getCityDTOById(Long id) {
        return cityRepository.getCityDTOById(id);
    }

    @Override
    public void deleteById(Long id) {
        cityRepository.deleteById(id);
    }


}
