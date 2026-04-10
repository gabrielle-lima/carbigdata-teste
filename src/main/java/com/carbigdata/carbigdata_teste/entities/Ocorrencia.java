package com.carbigdata.carbigdata_teste.entities;

import com.carbigdata.carbigdata_teste.enums.StatusOcorrencia;
import jakarta.persistence.*;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Ocorrencia {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cod_ocorrencia")
	private Long id;

	@JoinColumn(name = "cod_cliente")
	@ManyToOne(cascade = CascadeType.PERSIST)
	Cliente cliente;

	@ManyToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "cod_endereco")
	Endereco endereco;

	@Column(name = "dta_ocorrencia")
	private Instant dataOcorrencia  = Instant.now();

	@Enumerated(EnumType.STRING)
	private StatusOcorrencia statusOcorrencia;

	@OneToMany(mappedBy = "id")
	private List<FotoOcorrencia> fotosOcorrencia = new ArrayList<>();


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public StatusOcorrencia getStatusOcorrencia() {
		return statusOcorrencia;
	}

	public void setStatusOcorrencia(StatusOcorrencia statusOcorrencia) {
		this.statusOcorrencia = statusOcorrencia;
	}

	public Instant getDataOcorrencia() {
		return dataOcorrencia;
	}

	public void setDataOcorrencia(Instant dataOcorrencia) {
		this.dataOcorrencia = dataOcorrencia;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Ocorrencia() {
	}

	public Ocorrencia(Long id, StatusOcorrencia statusOcorrencia, Instant dataOcorrencia, Endereco endereco, Cliente cliente, List<FotoOcorrencia> fotosOcorrencia) {
		this.id = id;
		this.statusOcorrencia = statusOcorrencia;
		this.dataOcorrencia = dataOcorrencia;
		this.endereco = endereco;
		this.cliente = cliente;
		this.fotosOcorrencia = fotosOcorrencia;
	}


	public List<FotoOcorrencia> getFotosOcorrencia() {
		return fotosOcorrencia;
	}

	public void setFotosOcorrencia(List<FotoOcorrencia> fotosOcorrencia) {
		this.fotosOcorrencia = fotosOcorrencia;
	}
}
