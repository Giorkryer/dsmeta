package com.devsuperior.dsmeta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dsmeta.entities.Call;
import com.devsuperior.dsmeta.repositories.CallRepository;

@Service
public class CallService {
	
	@Autowired
	
	private CallRepository repository;
	public List<Call> findCalls() {
		return repository.findAll();
	}
}
