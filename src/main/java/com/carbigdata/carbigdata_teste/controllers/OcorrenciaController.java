package com.carbigdata.carbigdata_teste.controllers;

import com.carbigdata.carbigdata_teste.entities.Cliente;
import com.carbigdata.carbigdata_teste.entities.Ocorrencia;
import com.carbigdata.carbigdata_teste.helper.ClienteBuilder;
import com.carbigdata.carbigdata_teste.request.OcorrenciaRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.carbigdata.carbigdata_teste.services.OcorrenciaService;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1/ocorrencia")
public class OcorrenciaController {

	@Autowired
	private OcorrenciaService ocorrenciaService;


	@GetMapping("/ocorrencias")
	public ResponseEntity<List<Ocorrencia>> listarOcorrencias() {
		List<Ocorrencia> ocorrencias = ocorrenciaService.listarOcorrencias();
		return ResponseEntity.ok().body(ocorrencias);
	}

	@PostMapping("/nova-ocorrencia")
	public ResponseEntity<Ocorrencia> criarOcorrencia(@RequestBody OcorrenciaRequest ocorrenciaRequest) {
		Ocorrencia novaOcorrencia = ocorrenciaService.criarNovaOcorrencia(ocorrenciaRequest);
		return ResponseEntity.created(ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(novaOcorrencia.getId()).toUri()).body(novaOcorrencia);
	}
}
