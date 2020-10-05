package com.gonzo.dsclient.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.gonzo.dsclient.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long>{

		
}
