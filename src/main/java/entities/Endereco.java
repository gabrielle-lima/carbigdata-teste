package entities;

import jakarta.persistence.*;

@Entity
public class Endereco {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cod_endereco")
	private Long id;
    @Column(name = "nme_logradouro")
	private String logradouro;
	@Column(name = "nme_bairro")
	private String bairro;
	@Column(name = "nro_cep")
	private String CEP;
	@Column(name = "nme_cidade")
	private String cidade;
	@Column(name = "nme_estado")
	private String  estado;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getCEP() {
		return CEP;
	}

	public void setCEP(String CEP) {
		this.CEP = CEP;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public Endereco() {

	}

	public Endereco(String estado, String cidade, String CEP, String bairro, String logradouro, Long id) {
		this.estado = estado;
		this.cidade = cidade;
		this.CEP = CEP;
		this.bairro = bairro;
		this.logradouro = logradouro;
		this.id = id;
	}
}
