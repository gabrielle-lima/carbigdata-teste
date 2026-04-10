package com.carbigdata.carbigdata_teste.director;

import com.carbigdata.carbigdata_teste.interfaces.Builder;

import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Director {


	public void constructCliente(Builder builder) {
		builder.setNomeCliente("");
		builder.setCpf("");
		builder.setDataNascimento(LocalDate.now());
		builder.setDataCriacao(Instant.now());
		builder.setOcorrencias(new ArrayList<>());

	}
}
