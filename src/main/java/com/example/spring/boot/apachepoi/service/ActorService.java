package com.example.spring.boot.apachepoi.service;

import com.example.spring.boot.apachepoi.entity.Actor;

public interface ActorService {

	Iterable<Actor> findAll() throws Exception;
	
}
