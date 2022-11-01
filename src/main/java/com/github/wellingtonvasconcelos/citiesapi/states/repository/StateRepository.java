package com.github.wellingtonvasconcelos.citiesapi.states.repository;


import com.github.wellingtonvasconcelos.citiesapi.states.entities.State;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StateRepository extends JpaRepository<State, Long> {
}