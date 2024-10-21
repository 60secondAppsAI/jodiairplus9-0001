package com.jodiairplus9.dao;

import java.util.List;

import com.jodiairplus9.dao.GenericDAO;
import com.jodiairplus9.domain.Ticket;





public interface TicketDAO extends GenericDAO<Ticket, Integer> {
  
	List<Ticket> findAll();
	






}


