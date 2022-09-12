package com.devsuperior.dsmeta.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsmeta.entities.Call;
import com.devsuperior.dsmeta.services.CallService;


@RestController
@RequestMapping(value = "/calls")

public class CallController {
	@Autowired
	private CallService service;
	
	@GetMapping
	public List<Call> findCalls(){
		return service.findCalls();
	}
}
