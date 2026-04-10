package com.carbigdata.carbigdata_teste.repositories;

import com.carbigdata.carbigdata_teste.entities.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
}
