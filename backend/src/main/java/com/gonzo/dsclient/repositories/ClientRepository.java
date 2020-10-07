package com.gonzo.dsclient.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gonzo.dsclient.entities.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long>{

		
}
