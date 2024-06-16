/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.br.vianna.sistemaos.DAO;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author arthu
 */
public interface IGenericsDAO<G, K> {

    public void inserir(G obj) throws ClassNotFoundException, SQLException;

    public void editar(G obj) throws ClassNotFoundException, SQLException;

    public void apagar(K key) throws ClassNotFoundException, SQLException;

    public G buscarPorChave(K key) throws ClassNotFoundException, SQLException;

    public ArrayList<G> buscarTodos() throws ClassNotFoundException, SQLException;

    public int quantidade() throws ClassNotFoundException, SQLException;

}
