package com.moacyr_soares.customer_CRUD_challenge.repositories;

import com.moacyr_soares.customer_CRUD_challenge.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {


}
