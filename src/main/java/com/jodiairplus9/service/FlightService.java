package com.jodiairplus9.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.http.ResponseEntity;

import com.jodiairplus9.domain.Flight;
import com.jodiairplus9.dto.FlightDTO;
import com.jodiairplus9.dto.FlightSearchDTO;
import com.jodiairplus9.dto.FlightPageDTO;
import com.jodiairplus9.dto.FlightConvertCriteriaDTO;
import com.jodiairplus9.service.GenericService;
import com.jodiairplus9.dto.common.RequestDTO;
import com.jodiairplus9.dto.common.ResultDTO;
import java.util.List;
import java.util.Optional;





public interface FlightService extends GenericService<Flight, Integer> {

	List<Flight> findAll();

	ResultDTO addFlight(FlightDTO flightDTO, RequestDTO requestDTO);

	ResultDTO updateFlight(FlightDTO flightDTO, RequestDTO requestDTO);

    Page<Flight> getAllFlights(Pageable pageable);

    Page<Flight> getAllFlights(Specification<Flight> spec, Pageable pageable);

	ResponseEntity<FlightPageDTO> getFlights(FlightSearchDTO flightSearchDTO);
	
	List<FlightDTO> convertFlightsToFlightDTOs(List<Flight> flights, FlightConvertCriteriaDTO convertCriteria);

	FlightDTO getFlightDTOById(Integer flightId);







}





