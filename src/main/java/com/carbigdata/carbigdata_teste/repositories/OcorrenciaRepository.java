package com.carbigdata.carbigdata_teste.repositories;

import com.carbigdata.carbigdata_teste.entities.Ocorrencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OcorrenciaRepository extends JpaRepository<Ocorrencia, Long> {
}
