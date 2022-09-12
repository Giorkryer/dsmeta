package com.devsuperior.dsmeta.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.devsuperior.dsmeta.entities.Call;
import com.devsuperior.dsmeta.repositories.CallRepository;

@Service
public class CallService {
	
	@Autowired
	
	private CallRepository repository;
	public Page<Call> findCalls(Pageable pageable) {
		return repository.findAll(pageable);
	}
}
