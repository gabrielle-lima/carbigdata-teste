package entities;


import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import org.hibernate.validator.constraints.br.CPF;

import java.time.Instant;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(schema = "cliente")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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







}
