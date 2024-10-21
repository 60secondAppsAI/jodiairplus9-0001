package com.jodiairplus9.dao;

import java.util.List;

import com.jodiairplus9.dao.GenericDAO;
import com.jodiairplus9.domain.Plane;





public interface PlaneDAO extends GenericDAO<Plane, Integer> {
  
	List<Plane> findAll();
	






}


