package com.A5.SistemaOS.dao;

import com.A5.SistemaOS.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteDao extends JpaRepository<Cliente, Integer> {
}