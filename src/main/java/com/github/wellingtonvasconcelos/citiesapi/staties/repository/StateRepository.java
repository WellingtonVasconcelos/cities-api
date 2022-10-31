package com.github.wellingtonvasconcelos.citiesapi.staties.repository;

import com.github.wellingtonvasconcelos.citiesapi.staties.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}
