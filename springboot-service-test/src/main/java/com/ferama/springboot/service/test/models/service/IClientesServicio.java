package com.ferama.springboot.service.test.models.service;

import java.util.Date;
import java.util.List;

import com.ferama.springboot.service.test.models.entity.Clients;

public interface IClientesServicio {

		List<Clients> getAllClients();
		Clients getClientById(Long id);
		
		boolean addClient(String lastName, String adress, String name, String route);
		boolean updateClient(Clients id);
		boolean deleteClient(Long id);
}
