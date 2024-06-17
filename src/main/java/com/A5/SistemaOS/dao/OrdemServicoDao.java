package com.A5.SistemaOS.dao;

import com.A5.SistemaOS.model.OrdemServico;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrdemServicoDao extends JpaRepository<OrdemServico, Integer> {

    public OrdemServico findByProtocolo(String protocolo);

    public List<OrdemServico> findByClienteId(Integer cliente_id);

}