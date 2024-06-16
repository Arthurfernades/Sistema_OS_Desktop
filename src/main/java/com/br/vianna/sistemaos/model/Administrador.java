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
public class Administrador extends Usuario {

    private ArrayList<Usuario> Usuarios;

    public Administrador() {
    }

    public Administrador(ArrayList<Usuario> Usuarios, int id, String nome, String login, String senha, String email, ETipoUser tipo, ArrayList<OrdemServico> OS, ArrayList<Cliente> clientes) {
        super(id, nome, login, senha, email, tipo, OS, clientes);
        this.Usuarios = new ArrayList<>();
    }

    @Override
    public void addOS(OrdemServico os) {

    }

    @Override
    public void finalizarOS(OrdemServico os) {

    }

    @Override
    public void listarOS(ArrayList<OrdemServico> os) {

    }

    @Override
    public void addCliente(Cliente cliente) {

    }

    @Override
    public void listarCliente(ArrayList<Cliente> clientes) {

    }

    public ArrayList<Usuario> getUsuarios() {
        return Usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> Usuarios) {
        this.Usuarios = Usuarios;
    }

}
