package com.devsuperior.dsmeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsmeta.entities.Call;

public interface CallRepository extends JpaRepository<Call, Long> {

}
