package com.jodiairplus9.dao;

import java.util.List;

import com.jodiairplus9.dao.GenericDAO;
import com.jodiairplus9.domain.Airport;





public interface AirportDAO extends GenericDAO<Airport, Integer> {
  
	List<Airport> findAll();
	






}


