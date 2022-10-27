package com.github.wellingtonvasconcelos.citiesapi.countries.repository;

import com.github.wellingtonvasconcelos.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository <Country, Long> {

}
