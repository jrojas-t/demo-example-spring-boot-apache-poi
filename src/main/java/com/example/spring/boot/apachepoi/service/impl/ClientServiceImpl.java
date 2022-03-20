package com.example.spring.boot.apachepoi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring.boot.apachepoi.entity.Client;
import com.example.spring.boot.apachepoi.repository.ClientRepository;
import com.example.spring.boot.apachepoi.service.ClientService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ClientServiceImpl implements ClientService {

	@Autowired
	private ClientRepository clientRepository;
	
	@Override
	public Iterable<Client> findAll() throws Exception {
		return clientRepository.findAll();
	}

}
