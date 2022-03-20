package com.example.spring.boot.apachepoi.service;

import com.example.spring.boot.apachepoi.entity.Client;

public interface ClientService {

	Iterable<Client> findAll() throws Exception;
	
}
