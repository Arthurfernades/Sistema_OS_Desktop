/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.br.vianna.sistemaos.banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author arthu
 */
public class ConnectionFactory {

    public static Connection getConnection() throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");

        return DriverManager.getConnection("jdbc:mysql://localhost:3306/sistemaos_java", "root", "root");
    }

    public static void main(String[] args) throws SQLException {

        Connection c;
        try {
            c = ConnectionFactory.getConnection();
            System.out.println("" + c.getCatalog());
        } catch (ClassNotFoundException ex) {
            System.out.println("Erro ao conectar no banco de dados");
        }
    }
}
