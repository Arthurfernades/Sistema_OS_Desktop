package com.A5.SistemaOS.dao;

import com.A5.SistemaOS.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioDao extends JpaRepository<Funcionario, Integer> {
}
