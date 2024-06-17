package com.A5.SistemaOS.dao;

import com.A5.SistemaOS.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ClienteDao extends JpaRepository<Cliente, Integer> {

    public Cliente findByCpf(String cpf);

    public List<Cliente> findByNome(String nome);

}