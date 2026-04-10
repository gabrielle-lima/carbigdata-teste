package com.carbigdata.carbigdata_teste.request;

import com.carbigdata.carbigdata_teste.entities.Cliente;
import com.carbigdata.carbigdata_teste.entities.Endereco;
import com.carbigdata.carbigdata_teste.entities.FotoOcorrencia;
import com.carbigdata.carbigdata_teste.enums.StatusOcorrencia;

import java.time.Instant;
import java.util.List;

public record OcorrenciaRequest(Cliente cliente, Endereco endereco, Instant dataOcorrencia, StatusOcorrencia statusOcorrencia, List<FotoOcorrencia> fotosOcorrencia) {
	public OcorrenciaRequest(Cliente cliente, Endereco endereco, Instant dataOcorrencia, StatusOcorrencia statusOcorrencia, List<FotoOcorrencia> fotosOcorrencia) {
     this.cliente = cliente;
	 this.endereco = endereco;
	 this.dataOcorrencia = dataOcorrencia;
	 this.statusOcorrencia = statusOcorrencia;
	 this.fotosOcorrencia = fotosOcorrencia;
	}
}
