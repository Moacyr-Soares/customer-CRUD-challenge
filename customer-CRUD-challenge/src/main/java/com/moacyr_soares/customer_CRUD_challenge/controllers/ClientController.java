package com.moacyr_soares.customer_CRUD_challenge.controllers;


import com.moacyr_soares.customer_CRUD_challenge.dto.ClientDTO;
import com.moacyr_soares.customer_CRUD_challenge.entities.Client;
import com.moacyr_soares.customer_CRUD_challenge.repositories.ClientRepository;
import com.moacyr_soares.customer_CRUD_challenge.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping(value = "/clients")
public class ClientController {

    @Autowired
    private ClientService service;

    @GetMapping(value = "/{id}")
    public ResponseEntity<ClientDTO> findById(@PathVariable Long id) {
        return ResponseEntity.ok(service.findById(id));
    }
}
