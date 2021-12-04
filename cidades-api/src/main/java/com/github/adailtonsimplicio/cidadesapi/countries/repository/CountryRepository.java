package com.github.adailtonsimplicio.cidadesapi.countries.repository;

import com.github.adailtonsimplicio.cidadesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository  extends JpaRepository<Country, Long> {
}
