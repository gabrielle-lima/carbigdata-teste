package com.carbigdata.carbigdata_teste.interfaces;

import com.carbigdata.carbigdata_teste.entities.Ocorrencia;

import java.time.Instant;
import java.time.LocalDate;
import java.util.List;

public interface Builder {

	void setNomeCliente(String nome);
	void setDataNascimento(LocalDate dataNascimento);
	void setCpf(String cpf);
	void setDataCriacao(Instant dataCriacao);
	void setOcorrencias(List<Ocorrencia> lista);
}
