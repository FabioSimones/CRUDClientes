package com.CRUD.desafioCrudCliente.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.CRUD.desafioCrudCliente.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
