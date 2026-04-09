package entities;


import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import org.hibernate.validator.constraints.br.CPF;

import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
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
	private LocalDate dataNascimento;
	@Column(name = "nro_cpf")
	@CPF
	private String cpf;
	@Column(name = "dta_criacao")
	private Instant dataCriacao = Instant.now();
	@OneToMany(mappedBy = "cod_ocorrencia")
	private List<Ocorrencia> ocorrencias = new ArrayList<>();





	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Ocorrencia> getOcorrencias() {
		return ocorrencias;
	}

	public void setOcorrencias(List<Ocorrencia> ocorrencias) {
		this.ocorrencias = ocorrencias;
	}

	public Instant getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Instant dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public Cliente() {
	}

	public Cliente(Long id, String nomeCliente, LocalDate dataNascimento, Instant dataCriacao, List<Ocorrencia> ocorrencias) {
		this.id = id;
		this.nomeCliente = nomeCliente;
		this.dataNascimento = dataNascimento;
		this.dataCriacao = dataCriacao;
		this.ocorrencias = ocorrencias;

	}
}
