package com.codegym.service.country;

import com.codegym.model.Country;
import com.codegym.model.dto.CountryDTO;
import com.codegym.service.IGeneralService;

import java.util.List;

public interface CountryService extends IGeneralService<Country> {
    List<CountryDTO> getAllCountryDTO();

}
