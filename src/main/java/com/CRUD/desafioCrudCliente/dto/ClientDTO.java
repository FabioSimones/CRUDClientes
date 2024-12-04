package com.CRUD.desafioCrudCliente.dto;

import java.time.LocalDate;

import com.CRUD.desafioCrudCliente.entities.Client;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PastOrPresent;

public class ClientDTO {
	
	private Long id;	
	@NotBlank(message = "Necessário preencher este campo.")	
	private String name;
	private String cpf;
	private Double income;
	@PastOrPresent
	private LocalDate birthDate;
	private Integer children;
	
	public ClientDTO() {
		
	}
	
	public ClientDTO(Long id, String name, String cpf, Double income, LocalDate birthDate, 
			Integer children) {
		this.id = id;
		this.name = name;
		this.cpf = cpf;
		this.income = income;
		this.birthDate = birthDate;
		this.children = children;
	}
	
	public ClientDTO(Client entity) {
		id = entity.getId();
		name = entity.getName();
		cpf = entity.getCpf();
		income = entity.getIncome();
		birthDate = entity.getBirthDate();
		children = entity.getChildren();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getCpf() {
		return cpf;
	}

	public Double getIncome() {
		return income;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public Integer getChildren() {
		return children;
	}
	
}
