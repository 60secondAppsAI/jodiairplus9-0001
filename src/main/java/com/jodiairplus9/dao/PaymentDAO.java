package com.jodiairplus9.dao;

import java.util.List;

import com.jodiairplus9.dao.GenericDAO;
import com.jodiairplus9.domain.Payment;





public interface PaymentDAO extends GenericDAO<Payment, Integer> {
  
	List<Payment> findAll();
	






}


