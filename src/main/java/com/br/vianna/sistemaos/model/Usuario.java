/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.br.vianna.sistemaos.model;

import com.br.vianna.sistemaos.model.tipos.ETipoUser;
import java.util.ArrayList;

/**
 *
 * @author arthu
 */
public abstract class Usuario {

    private int id;
    private String nome;
    private String login;
    private String senha;
    private String email;
    private ETipoUser tipo;
    private ArrayList<OrdemServico> OS;
    private ArrayList<Cliente> clientes;

    public Usuario() {
    }

    public Usuario(int id, String nome, String login, String senha,
            String email, ETipoUser tipo, ArrayList<OrdemServico> OS,
            ArrayList<Cliente> clientes) {
        this.id = id;
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.email = email;
        this.tipo = tipo;
        this.OS = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public abstract void addCliente(Cliente cliente);

    public abstract void listarCliente(ArrayList<Cliente> clientes);

    public abstract void addOS(OrdemServico os);

    public abstract void listarOS(ArrayList<OrdemServico> os);

    public abstract void finalizarOS(OrdemServico os);

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ETipoUser getTipo() {
        return tipo;
    }

    public void setTipo(ETipoUser tipo) {
        this.tipo = tipo;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> Clientes) {
        this.clientes = Clientes;
    }

    public ArrayList<OrdemServico> getOS() {
        return OS;
    }

    public void setOS(ArrayList<OrdemServico> listaOS) {
        this.OS = listaOS;
    }

}
