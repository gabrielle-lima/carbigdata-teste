package com.carbigdata.carbigdata_teste.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.carbigdata.carbigdata_teste.services.EnderecoService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnderecoController {

	@Autowired
	private  EnderecoService enderecoService;


}
