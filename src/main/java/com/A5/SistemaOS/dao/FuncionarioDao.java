package com.A5.SistemaOS.dao;

import com.A5.SistemaOS.model.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FuncionarioDao extends JpaRepository<Funcionario, Integer> {

    public Funcionario findByLogin(String login);

    public Funcionario findByEmail(String email);

    public Funcionario findByLoginAndSenha(String login, String senha);

    public List<Funcionario> findByNome(String nome);
}
