package com.carbigdata.carbigdata_teste.request;

import com.carbigdata.carbigdata_teste.entities.Ocorrencia;

import java.time.Instant;
import java.time.LocalDate;
import java.util.List;

public record ClienteRequest(String nomeCliente, LocalDate dataNascimento, String cpf, Instant dataCriacao, List<Ocorrencia> ocorrencias) {
	public ClienteRequest(String nomeCliente, LocalDate dataNascimento, String cpf, Instant dataCriacao, List<Ocorrencia> ocorrencias){
    this.nomeCliente = nomeCliente;
	this.dataNascimento = dataNascimento;
	this.cpf = cpf;
	this.dataCriacao = dataCriacao;
	this.ocorrencias = ocorrencias;
	}
}
