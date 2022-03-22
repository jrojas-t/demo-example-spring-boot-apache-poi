package com.example.spring.boot.apachepoi.rest.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.spring.boot.apachepoi.entity.Actor;
import com.example.spring.boot.apachepoi.rest.helper.ActorHelper;
import com.example.spring.boot.apachepoi.service.ActorService;
import com.example.spring.boot.apachepoi.utils.ActorExcelExporter;

@RestController
@RequestMapping("/actor")
public class ActorController {

	@Autowired
	private ActorService service;

	@GetMapping("/export")
	public void expoertToExcel(HttpServletResponse response) throws Exception {

		response.setContentType(MediaType.APPLICATION_OCTET_STREAM_VALUE);
		String headerKey = HttpHeaders.CONTENT_DISPOSITION;
		String headerValue = "attachement; filename=".concat(ActorHelper.returnNameExcel());

		response.setHeader(headerKey, headerValue);

		Iterable<Actor> actors = service.findAll();
		ActorExcelExporter excelExporter = new ActorExcelExporter(actors);
		excelExporter.export(response);

	}
}
