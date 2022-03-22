package com.example.spring.boot.apachepoi.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.spring.boot.apachepoi.entity.Actor;
import com.example.spring.boot.apachepoi.repository.ActorRepository;
import com.example.spring.boot.apachepoi.service.ActorService;

@Service
public class ActorServiceImpl implements ActorService {

	@Autowired
	private ActorRepository repository;

	@Override
	public Iterable<Actor> findAll() throws Exception {
		return repository.findAll();
	}
}
