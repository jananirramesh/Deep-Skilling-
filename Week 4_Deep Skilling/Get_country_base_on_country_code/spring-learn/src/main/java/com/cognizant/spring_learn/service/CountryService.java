package com.cognizant.spring_learn.service;

import com.cognizant.spring_learn.model.Countries;
import com.cognizant.spring_learn.model.Country;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.xml.bind.JAXBContext;
import java.util.List;

@Service
public class CountryService {
    private List<Country> countryList;

    @PostConstruct
    public void loadCountries() throws Exception {
        var context = JAXBContext.newInstance(Countries.class);
        var unmarshaller = context.createUnmarshaller();
        var input = getClass().getClassLoader().getResourceAsStream("country.xml");
        var countries = (Countries) unmarshaller.unmarshal(input);
        countryList = countries.getCountry();
    }

    public Country getCountry(String code) {
        return countryList.stream()
                .filter(c -> c.getCode().equalsIgnoreCase(code))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Country not found"));
    }
}
