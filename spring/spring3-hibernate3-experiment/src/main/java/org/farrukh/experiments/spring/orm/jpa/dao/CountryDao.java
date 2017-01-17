package org.farrukh.experiments.spring.orm.jpa.dao;

import org.farrukh.experiments.spring.orm.dao.ICountryDao;
import org.farrukh.experiments.spring.orm.model.Country;
import org.springframework.stereotype.Repository;

@Repository
public class CountryDao extends AbstractJpaDao<Country> implements ICountryDao {

    public CountryDao() {
        super(Country.class);
    }

}
