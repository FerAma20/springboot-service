package com.ferama.springboot.service.test.controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ferama.springboot.service.test.models.entity.Clients;
import com.ferama.springboot.service.test.models.service.IClienteServicioImpl;

@RestController
public class ClientsController {
	
	@Autowired
	IClienteServicioImpl iClienteServicioImpl;
	
	@GetMapping("/getAllClients")
	public List<Clients> getAllClients(){
		
		return iClienteServicioImpl.getAllClients();
	}
	
	@GetMapping("/getClientById/{id}")
	public Clients getClientById(@PathVariable Long id) {
		return iClienteServicioImpl.getClientById(id);
	}
	
	@PostMapping("/addClient/{lastName}/{adress}/{name}/{route}")
	public boolean addClient(@PathVariable String lastName,@PathVariable String adress,@PathVariable String name,@PathVariable String route) {
		try 
		{
			System.out.println(lastName);
			iClienteServicioImpl.addClient( lastName, adress,  name,  route);
			
			
			return true;
		}
		catch(Exception ex) 
		{
			return false;
		}
	}
	
	@PutMapping("/updateClient")
	public boolean updateClient(@RequestBody Clients updateClient) {
	
		System.out.println(updateClient.getLastName());
			boolean service = iClienteServicioImpl.updateClient(updateClient);
			
			if(service)return true;
			
			return false;
	}
	
	@DeleteMapping("/deleteClient/{id}")
	public boolean deleteClient(@PathVariable Long id) {
		try 
		{
			iClienteServicioImpl.deleteClient( id);
			return true;
		}
		catch(Exception ex) 
		{
			return false;
		}
	}

}
