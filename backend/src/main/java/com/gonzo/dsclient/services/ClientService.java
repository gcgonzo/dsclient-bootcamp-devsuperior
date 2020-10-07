package com.gonzo.dsclient.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gonzo.dsclient.entities.Client;
import com.gonzo.dsclient.repositories.ClientRepository;

@Service
public class ClientService {
	
	@Autowired
	private ClientRepository repository;
	
	public List<Client>findAll(){
		return repository.findAll();
		
		
	}
	

}