package com.carbigdata.carbigdata_teste.controllers;

import org.springframework.stereotype.Controller;
import com.carbigdata.carbigdata_teste.services.ClienteService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {

	private final ClienteService clienteService;


	public ClienteController(ClienteService clienteService) {
		this.clienteService = clienteService;
	}




}
