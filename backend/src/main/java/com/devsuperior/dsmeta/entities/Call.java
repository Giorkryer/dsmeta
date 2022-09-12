package com.devsuperior.dsmeta.entities;

import java.time.LocalDate;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_call")
public class Call {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String sellerName;
	private Integer idTec;
	private Integer idSector;
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

	public Integer getIdTec() {
		return idTec;
	}

	public void setIdTec(Integer idTec) {
		this.idTec = idTec;
	}

	public Integer getIdSector() {
		return idSector;
	}

	public void setIdSector(Integer idSector) {
		this.idSector = idSector;
	}
	
	
}


