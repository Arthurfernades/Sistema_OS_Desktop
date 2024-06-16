/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.br.vianna.sistemaos.model;

import com.br.vianna.sistemaos.model.tipos.ESexo;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author arthu
 */
public class Cliente {

    private int id;
    private String nome;
    private String cpf;
    private LocalDate nasc;
    private ESexo sexo;
    private String telefone;
    private String endereco;
    private String bairro;
    private String cidade;
    private String cep;
    private String email;
    private ArrayList<OrdemServico> listaOS;
    private Usuario funcionario;

    public Cliente() {
    }

    public Cliente(int id, String nome, String cpf, LocalDate nasc, ESexo sexo,
            String telefone, String endereco, String bairro, String cidade,
            String cep, String email, ArrayList<OrdemServico> listaOS, Usuario funcionario) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.nasc = nasc;
        this.sexo = sexo;
        this.telefone = telefone;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cidade = cidade;
        this.cep = cep;
        this.email = email;
        this.listaOS = new ArrayList<>();
        this.funcionario = funcionario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getNasc() {
        return nasc;
    }

    public void setNasc(LocalDate nasc) {
        this.nasc = nasc;
    }

    public ESexo getSexo() {
        return sexo;
    }

    public void setSexo(ESexo sexo) {
        this.sexo = sexo;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<OrdemServico> getListaOS() {
        return listaOS;
    }

    public void setListaOS(ArrayList<OrdemServico> listaOS) {
        this.listaOS = listaOS;
    }

    public Usuario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Usuario funcionario) {
        this.funcionario = funcionario;
    }

}
