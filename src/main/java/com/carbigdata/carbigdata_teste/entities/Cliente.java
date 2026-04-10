package com.carbigdata.carbigdata_teste.entities;


import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import org.hibernate.validator.constraints.br.CPF;

import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cod_cliente")
	private Long  id;
	@Column(name = "nme_cliente")
	private String nomeCliente;
	@Column(name = "dta_nascimento")
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private LocalDate dataNascimento = LocalDate.now();
	@Column(name = "nro_cpf")
	@CPF
	private String cpf;
	@Column(name = "dta_criacao")
	private Instant dataCriacao = Instant.now();
	@OneToMany(mappedBy = "id", cascade = CascadeType.ALL)
	private List<Ocorrencia> ocorrencias = new ArrayList<>();


	public Long getId() {
		return id;
	}

	public List<Ocorrencia> getOcorrencias() {
		return ocorrencias;
	}


	public Instant getDataCriacao() {
		return dataCriacao;
	}


	public LocalDate getDataNascimento() {
		return dataNascimento;
	}



	public String getCpf() {
		return cpf;
	}


	public String getNomeCliente() {
		return nomeCliente;
	}

	public Cliente() {
	}
	public Cliente(String nomeCliente, LocalDate dataNascimento,String cpf, Instant dataCriacao, List<Ocorrencia> ocorrencias) {
		this.nomeCliente = nomeCliente;
		this.dataNascimento = dataNascimento;
		this.cpf = cpf;
		this.dataCriacao = dataCriacao;
		this.ocorrencias = ocorrencias;

	}

	public Cliente(Long id, String nomeCliente, LocalDate dataNascimento, Instant dataCriacao, List<Ocorrencia> ocorrencias) {
		this.id = id;
		this.nomeCliente = nomeCliente;
		this.dataNascimento = dataNascimento;
		this.dataCriacao = dataCriacao;
		this.ocorrencias = ocorrencias;

	}


}
