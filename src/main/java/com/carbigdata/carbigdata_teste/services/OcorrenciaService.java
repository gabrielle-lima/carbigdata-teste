package com.carbigdata.carbigdata_teste.services;

import com.carbigdata.carbigdata_teste.entities.Cliente;
import com.carbigdata.carbigdata_teste.entities.Ocorrencia;
import com.carbigdata.carbigdata_teste.enums.StatusOcorrencia;
import com.carbigdata.carbigdata_teste.helper.ClienteBuilder;
import com.carbigdata.carbigdata_teste.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.carbigdata.carbigdata_teste.repositories.OcorrenciaRepository;
import com.carbigdata.carbigdata_teste.request.OcorrenciaRequest;

import java.util.List;

@Service
public class OcorrenciaService {

	@Autowired
	private OcorrenciaRepository ocorrenciaRepository;

	@Autowired
	private ClienteRepository clienteRepository;

	public List<Ocorrencia> listarOcorrencias() {
		return ocorrenciaRepository.findAll();
	}


	public Ocorrencia criarNovaOcorrencia(OcorrenciaRequest ocorrenciaRequest) {
		ClienteBuilder clienteBuilder = new ClienteBuilder();
		Cliente cliente = ocorrenciaRequest.cliente();
		clienteBuilder.setNomeCliente(cliente.getNomeCliente());
		clienteBuilder.setDataNascimento(cliente.getDataNascimento());
		clienteBuilder.setCpf(cliente.getCpf());
		clienteBuilder.setDataCriacao(ocorrenciaRequest.dataOcorrencia());
		clienteBuilder.setOcorrencias(cliente.getOcorrencias());
		clienteRepository.save(cliente);
		Ocorrencia ocorrencia = new Ocorrencia();
		ocorrencia.setCliente(clienteBuilder.getResult());
		ocorrencia.setEndereco(ocorrenciaRequest.endereco());
		ocorrencia.setDataOcorrencia(ocorrenciaRequest.dataOcorrencia());
		ocorrencia.setStatusOcorrencia(ocorrenciaRequest.statusOcorrencia());
		return ocorrenciaRepository.save(ocorrencia);
	}

	public Ocorrencia alterarStatusOcorrencia(Long id, StatusOcorrencia statusOcorrencia) {
		return null;
	}


}
