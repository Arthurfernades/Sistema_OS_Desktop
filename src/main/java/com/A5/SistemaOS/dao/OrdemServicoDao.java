package com.A5.SistemaOS.dao;

import com.A5.SistemaOS.model.OrdemServico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdemServicoDao extends JpaRepository<OrdemServico, Integer> {
}