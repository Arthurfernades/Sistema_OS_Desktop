package com.A5.SistemaOS.dao;

import com.A5.SistemaOS.model.Administrador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdministradorDao extends JpaRepository<Administrador, Integer> {
}