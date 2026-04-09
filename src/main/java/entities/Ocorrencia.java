package entities;

import enums.StatusOcorrencia;
import jakarta.persistence.*;

import java.time.Instant;

@Entity
public class Ocorrencia {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cod_ocorrencia")
	private Long id;

	@ManyToOne
	@JoinColumn(name = "cod_cliente")
	Cliente cliente;

	@ManyToOne
	@JoinColumn(name = "cod_endereco")
	Endereco endereco;

	@Column(name = "dta_ocorrencia")
	private Instant dataOcorrencia  = Instant.now();

	@Enumerated(EnumType.STRING)
	private StatusOcorrencia statusOcorrencia;


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

	public Ocorrencia(Long id, StatusOcorrencia statusOcorrencia, Instant dataOcorrencia, Endereco endereco, Cliente cliente) {
		this.id = id;
		this.statusOcorrencia = statusOcorrencia;
		this.dataOcorrencia = dataOcorrencia;
		this.endereco = endereco;
		this.cliente = cliente;
	}
}
