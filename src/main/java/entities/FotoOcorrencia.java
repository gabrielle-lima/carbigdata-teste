package entities;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
public class FotoOcorrencia {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "cod_foto_ocorrencia")
	private Long id;

	@ManyToOne
	@JoinColumn(name = "cod_ocorrencia")
	private Ocorrencia ocorrencia;


	@Column(name = "dta_criacao")
	private Instant dataCriacao = Instant.now();

	@Column(name = "dsc_path_bucket")
	private String caminhoBucket;

	@Column(name = "dsc_hash_objeto")
	private String hashObjeto;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getHashObjeto() {
		return hashObjeto;
	}

	public void setHashObjeto(String hashObjeto) {
		this.hashObjeto = hashObjeto;
	}

	public String getCaminhoBucket() {
		return caminhoBucket;
	}

	public void setCaminhoBucket(String caminhoBucket) {
		this.caminhoBucket = caminhoBucket;
	}

	public Instant getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Instant dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public Ocorrencia getOcorrencia() {
		return ocorrencia;
	}

	public void setOcorrencia(Ocorrencia ocorrencia) {
		this.ocorrencia = ocorrencia;
	}

	public FotoOcorrencia() {
	}

	public FotoOcorrencia(Long id, String hashObjeto, String caminhoBucket, Instant dataCriacao, Ocorrencia ocorrencia) {
		this.id = id;
		this.hashObjeto = hashObjeto;
		this.caminhoBucket = caminhoBucket;
		this.dataCriacao = dataCriacao;
		this.ocorrencia = ocorrencia;
	}
}

