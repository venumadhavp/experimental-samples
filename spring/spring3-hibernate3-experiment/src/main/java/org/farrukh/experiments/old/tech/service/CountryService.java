package org.farrukh.experiments.old.tech.service;

import java.util.List;

import org.farrukh.experiments.old.tech.dao.ICountryDao;
import org.farrukh.experiments.old.tech.model.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CountryService {

    @Autowired
    private ICountryDao countryDao;
    
    public List<Country> findAll() {
        return countryDao.findAll();
    }
    
    
}