package com.moacyr_soares.customer_CRUD_challenge.services;

import com.moacyr_soares.customer_CRUD_challenge.dto.ClientDTO;
import com.moacyr_soares.customer_CRUD_challenge.entities.Client;
import com.moacyr_soares.customer_CRUD_challenge.exceptions.ResourceNotFoundException;
import com.moacyr_soares.customer_CRUD_challenge.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ClientService {

    @Autowired
    private ClientRepository repository;

    @Transactional(readOnly = true)
    public ClientDTO findById(Long id){

        Client client = repository.findById(id).orElseThrow(

                ()-> new ResourceNotFoundException("Recurso não encontrado"));
        return new ClientDTO(client);
    }

    @Transactional(readOnly = true)
    public Page<ClientDTO> findAll(Pageable pageable) {
        Page<Client> result = repository.findAll(pageable);
        return result.map(ClientDTO::new);

    }
}