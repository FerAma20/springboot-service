package com.ferama.springboot.service.test.models.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ferama.springboot.service.test.models.entity.Clients;

public interface ClientesRepository extends JpaRepository<Clients, Long>{

}
