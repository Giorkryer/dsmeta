package com.devsuperior.dsmeta.entities;

import java.time.LocalDate;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_sales")
public class Call {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String sellerName;
	private Long idTec;
	private Long idSector;
	private String descricao;
	private LocalDate date;
	
	
	public Call() {		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public LocalDate getdate() {
		return date;
	}

	public void setdate(LocalDate date) {
		this.date = date;
	}

	public String getdescricao() {
		return descricao;
	}

	public void setDescriçao(String descricao) {
		this.descricao = descricao;
	}

	public Long getIdTec() {
		return idTec;
	}

	public void setIdTec(Long idTec) {
		this.idTec = idTec;
	}

	public Long getIdSector() {
		return idSector;
	}

	public void setIdSector(Long idSector) {
		this.idSector = idSector;
	}
	
	
}


