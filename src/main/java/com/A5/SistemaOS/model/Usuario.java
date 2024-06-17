package com.A5.SistemaOS.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@MappedSuperclass
@Data
@AllArgsConstructor
@NoArgsConstructor
public abstract class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 50, nullable = false)
    private String nome;

    @Column(unique = true, length = 20)
    private String login;

    @Column(length = 20, nullable = false)
    private String senha;

    private String email;

//    private ArrayList<OrdemServico> NovoChamado;

//    public abstract void addCliente(Cliente cliente);
//
//    public abstract void listarCliente(ArrayList<Cliente> clientes);
//
//    public abstract void addOS(OrdemServico os);
//
//    public abstract void listarOS(ArrayList<OrdemServico> os);
//
//    public abstract void finalizarOS(OrdemServico os);

}
