package com.carbigdata.carbigdata_teste.repositories;

import com.carbigdata.carbigdata_teste.entities.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
