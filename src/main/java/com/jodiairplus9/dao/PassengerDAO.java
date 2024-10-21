package com.jodiairplus9.dao;

import java.util.List;

import com.jodiairplus9.dao.GenericDAO;
import com.jodiairplus9.domain.Passenger;





public interface PassengerDAO extends GenericDAO<Passenger, Integer> {
  
	List<Passenger> findAll();
	






}


