package com.carbigdata.carbigdata_teste.helper;

import com.carbigdata.carbigdata_teste.entities.Cliente;
import com.carbigdata.carbigdata_teste.entities.Ocorrencia;
import com.carbigdata.carbigdata_teste.interfaces.Builder;
import tools.jackson.databind.ext.javatime.deser.LocalDateDeserializer;

import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ClienteBuilder implements Builder {

	private String nome;
	private LocalDate dataNascimento;
	private String cpf;
	private Instant dataCriacao;
	private List<Ocorrencia> listaOcorrencias = new ArrayList<>();

	@Override
	public void setNomeCliente(String nome) {
		this.nome = nome;
	}

	@Override
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;

	}

	@Override
	public void setCpf(String cpf) {
     this.cpf = cpf;
	}

	@Override
	public void setDataCriacao(Instant dataCriacao) {
		this.dataCriacao = dataCriacao;

	}

	@Override
	public void setOcorrencias(List<Ocorrencia> lista) {
		 this.listaOcorrencias = lista;

	}

	public Cliente getResult() {
      return new Cliente(nome, dataNascimento, cpf, dataCriacao, listaOcorrencias);
	}
}
