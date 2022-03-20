package com.example.spring.boot.apachepoi.rest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.boot.apachepoi.entity.Client;
import com.example.spring.boot.apachepoi.service.ClientService;

@RestController
@RequestMapping("/client")
public class ClientController {

	@Autowired
	private ClientService service;

	@GetMapping("/all")
	public ResponseEntity<?> getClientAll() {
		
		try {
			Iterable<Client> clients = service.findAll();
			
			return new ResponseEntity<>(clients, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>("Internal error with list", HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

}
