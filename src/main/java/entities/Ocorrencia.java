package entities;

import jakarta.persistence.*;

@Entity
@Table(schema = "ocorrencia")
public class Ocorrencia {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cod_ocorrencia")
	private Long id;

	@ManyToOne
	@JoinColumn(name = "cod_cliente")
	Cliente cliente;

	@ManyToOne
	@JoinColumn(name = "cod_endereco")
	Endereco endereco;

}
