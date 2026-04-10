package com.carbigdata.carbigdata_teste.request;

import jakarta.validation.constraints.NotNull;

public record EnderecoRequest(String logradouro, String bairro, String cep, String cidade, String estado) {

	public EnderecoRequest(@NotNull String logradouro, @NotNull String bairro,@NotNull String cep,@NotNull String cidade,@NotNull String estado) {
		this.logradouro = logradouro;
		this.bairro = bairro;
		this.cep = cep;
		this.cidade = cidade;
		this.estado = estado;
	}
}
