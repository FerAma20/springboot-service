package com.ferama.springboot.service.test.models.service;

import java.util.Date;
import java.util.List;

import javax.print.attribute.standard.DateTimeAtCompleted;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ferama.springboot.service.test.models.entity.Clients;
import com.ferama.springboot.service.test.models.repository.ClientesRepository;

@Service
public class IClienteServicioImpl implements IClientesServicio {
	
	@Autowired
	ClientesRepository clientesRepository;

	
	@Override
	public List<Clients> getAllClients() {
		return clientesRepository.findAll();
	}

	@Override
	public Clients getClientById(Long ID) {
		return clientesRepository.findById(ID).orElse(null);
	}

	@Override
	public boolean addClient(String lastName, String adress, String name, String route) {
		try 
		{
			Date date = new Date();  
			Clients newClient = new Clients(lastName, adress,  name,  route);
			newClient.setCreateDate(date);
			clientesRepository.save(newClient);
			System.out.print(newClient);
			return true;
		}
		catch(Exception ex) 
		{
			return false;
		}
	}

	@Override
	public boolean updateClient(Clients updateClient) {
		try 
		{System.out.println(updateClient.getName());
			clientesRepository.save(updateClient);
			return true;
		}
		catch(Exception ex) 
		{
			return false;
		}
		
	}

	@Override
	public boolean deleteClient(Long ID) {
		try 
		{
			clientesRepository.deleteById(ID);
			return true;
		}
		catch(Exception ex) 
		{
			return false;
		}
	}

}
