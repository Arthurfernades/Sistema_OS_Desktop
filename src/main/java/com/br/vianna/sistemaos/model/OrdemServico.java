/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.br.vianna.sistemaos.model;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author arthu
 */
public class OrdemServico {

    private int id;
    private Timestamp inicio;
    private Timestamp fim;
    private Usuario funcionario;
    private Cliente cliente;
    private String descricao;
    private double valor;
    private String protocolo;

    public OrdemServico() {
    }

    public OrdemServico(int id, Timestamp inicio, Timestamp fim,
            Usuario funcionario, Cliente cliente, String descricao,
            double valor, String protocolo) {
        this.id = id;
        this.inicio = inicio;
        this.fim = fim;
        this.funcionario = funcionario;
        this.cliente = cliente;
        this.descricao = descricao;
        this.valor = valor;
        this.protocolo = protocolo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Timestamp getInicio() {
        return inicio;
    }

    public void setInicio(Timestamp inicio) {
        this.inicio = inicio;
    }

    public void iniciar() {

        inicio = Timestamp.valueOf(LocalDateTime.now());

    }

    public Timestamp getFim() {
        return fim;
    }

    public void setFim(Timestamp fim) {
        this.fim = fim;
    }

    public void finalizar() {

        fim = Timestamp.valueOf(LocalDateTime.now());

    }

    public Usuario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Usuario funcionario) {
        this.funcionario = funcionario;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getProtocolo() {
        return protocolo;
    }

    public void setProtocolo() {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        String protocolo = sdf.format(inicio);

        this.protocolo = protocolo;
    }
}
