package com.example.spring.boot.apachepoi.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.spring.boot.apachepoi.entity.Client;

public interface ClientRepository extends CrudRepository<Client, Integer> {

}
