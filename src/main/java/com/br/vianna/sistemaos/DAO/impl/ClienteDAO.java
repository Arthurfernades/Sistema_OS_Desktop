/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.br.vianna.sistemaos.DAO.impl;

import com.br.vianna.sistemaos.DAO.IGenericsDAO;
import com.br.vianna.sistemaos.banco.ConnectionFactory;
import com.br.vianna.sistemaos.model.Administrador;
import com.br.vianna.sistemaos.model.Cliente;
import com.br.vianna.sistemaos.model.Funcionario;
import com.br.vianna.sistemaos.model.OrdemServico;
import com.br.vianna.sistemaos.model.Usuario;
import com.br.vianna.sistemaos.model.tipos.ESexo;
import com.br.vianna.sistemaos.model.tipos.ETipoUser;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author arthu
 */
public class ClienteDAO implements IGenericsDAO<Cliente, Integer> {

    public static void main(String[] args) {

        Usuario u = new Funcionario(11, "Careca", "careca", "123", "careca@email.com", ETipoUser.F, null, null);

        Cliente c = new Cliente(0, "Josefina", "11122233356",
                null, ESexo.F, null, null, null,
                null, "12345678", null, null, u);

        try {

            new ClienteDAO().inserir(c);

        } catch (ClassNotFoundException | SQLException ex) {

            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);

        }

    }

    /**
     *
     * @param client
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    @Override
    public void inserir(Cliente client) throws ClassNotFoundException, SQLException {

        Connection c = ConnectionFactory.getConnection();

        String sql = "INSERT INTO cliente\n"
                + "(nome, cpf, nasc, sexo, telefone, endereco, bairro, cidade, cep, email, id_usuario)\n"
                + "VALUES\n"
                + "(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";

        PreparedStatement pst = c.prepareStatement(sql);

        pst.setString(1, client.getNome());
        pst.setString(2, client.getCpf());
        pst.setObject(3, client.getNasc());
        pst.setString(4, client.getSexo().toString());
        pst.setString(5, client.getTelefone());
        pst.setString(6, client.getEndereco());
        pst.setString(7, client.getBairro());
        pst.setString(8, client.getCidade());
        pst.setString(9, client.getCep());
        pst.setString(10, client.getEmail());
        pst.setInt(11, client.getFuncionario().getId());

        pst.execute();
    }

    @Override
    public void editar(Cliente client) throws ClassNotFoundException, SQLException {

        Connection c = ConnectionFactory.getConnection();

        String sql = "UPDATE cliente\n"
                + "SET nome = ?, cpf = ?, nasc = ?, sexo = ?, telefone = ?,\n"
                + " endereco = ?, bairro = ?, cidade = ?, cep = ?, email = ?\n"
                + "WHERE id_cliente = ?;";

        PreparedStatement pst = c.prepareStatement(sql);

        pst.setString(1, client.getNome());
        pst.setString(2, client.getCpf());
        pst.setObject(3, client.getNasc());
        pst.setString(4, client.getSexo().toString());
        pst.setString(5, client.getTelefone());
        pst.setString(6, client.getEndereco());
        pst.setString(7, client.getBairro());
        pst.setString(8, client.getCidade());
        pst.setString(9, client.getCep());
        pst.setString(10, client.getEmail());
        pst.setInt(11, client.getId());

        pst.execute();

    }

    @Override
    public void apagar(Integer key) throws ClassNotFoundException, SQLException {

        Connection c = ConnectionFactory.getConnection();

        String sql = "DELETE FROM cliente\n"
                + "WHERE id_cliente = ?;";

        PreparedStatement pst = c.prepareStatement(sql);

        pst.setInt(1, key);

        pst.execute();

    }

    @Override
    public int quantidade() throws ClassNotFoundException, SQLException {

        Connection c = ConnectionFactory.getConnection();

        String sql = "SELECT count(*)\n"
                + "FROM cliente;";

        PreparedStatement pst = c.prepareStatement(sql);

        ResultSet rs = pst.executeQuery();

        rs.next();

        return rs.getInt(1);

    }

    @Override
    public Cliente buscarPorChave(Integer key) throws ClassNotFoundException, SQLException {

        Connection c = ConnectionFactory.getConnection();

        String sql = "SELECT c.*, u.*, os.*\n"
                + "FROM cliente c\n"
                + "left join usuario u on u.id_usuario = c.id_usuario\n"
                + "left join ordem_servico os on os.id_cliente = c.id_cliente\n"
                + "WHERE id_cliente = ?;";

        PreparedStatement pst = c.prepareStatement(sql);

        pst.setInt(1, key);

        return preencheObejetos(pst);

    }

    public Cliente buscarPorCpf(String cpf) throws ClassNotFoundException, SQLException {

        Connection c = ConnectionFactory.getConnection();

        String sql = "SELECT c.*, u.*, os.*\n"
                + "FROM cliente c\n"
                + "left join usuario u on u.id_usuario = c.id_usuario\n"
                + "left join ordem_servico os on os.id_cliente = c.id_cliente\n"
                + "WHERE cpf = ?;";

        PreparedStatement pst = c.prepareStatement(sql);

        pst.setString(1, cpf);

        return preencheObejetos(pst);
    }

    @Override
    public ArrayList<Cliente> buscarTodos() throws ClassNotFoundException, SQLException {

        Connection c = ConnectionFactory.getConnection();

        String sql = "SELECT c.*, u.*, os.*\n"
                + "FROM cliente c\n"
                + "left join usuario u on u.id_usuario = c.id_usuario\n"
                + "left join ordem_servico os on os.id_cliente = c.id_cliente\n"
                + "order by c.nome asc;";

        PreparedStatement pst = c.prepareStatement(sql);

        return preencheArrayObejetos(pst);

    }

    public ArrayList<Cliente> buscarPorNome(String nome) throws ClassNotFoundException, SQLException {

        Connection c = ConnectionFactory.getConnection();

        String sql = "SELECT c.*, u.*\n"
                + "FROM cliente c\n"
                + "left join usuario u on u.id_usuario = c.id_usuario\n"
                + "WHERE c.nome LIKE ?\n"
                + "order by c.nome asc;";

        PreparedStatement pst = c.prepareStatement(sql);

        pst.setString(1, nome + "%");

        return preencheArrayObejetos(pst);
    }

    public ArrayList<Cliente> buscarPorIdUsuario(Integer id) throws ClassNotFoundException, SQLException {

        Connection c = ConnectionFactory.getConnection();

        String sql = "SELECT c.*, u.*\n"
                + "FROM cliente c\n"
                + "inner join usuario u on u.id_usuario = c.id_usuario\n"
                + "WHERE id_usuario =  ?\n"
                + "order by c.nome asc;";

        PreparedStatement pst = c.prepareStatement(sql);

        pst.setInt(1, id);

        return preencheArrayObejetos(pst);
    }

    public Cliente preencheObejetos(PreparedStatement pst) throws ClassNotFoundException, SQLException {

        ResultSet rs = pst.executeQuery();

        Cliente cl = null;

        Usuario u;

        ArrayList<OrdemServico> lista = new ArrayList<>();

        if (rs.next()) {

            if (rs.getString("tipo").equals('A')) {
                u = new Administrador(null,
                        rs.getInt(1),
                        rs.getString("nome"),
                        rs.getString("login"),
                        rs.getString("senha"),
                        rs.getString("email"),
                        ETipoUser.A, null, null);
            } else {
                u = new Funcionario(rs.getInt(1),
                        rs.getString("nome"),
                        rs.getString("login"),
                        rs.getString("senha"),
                        rs.getString("email"),
                        ETipoUser.F, null, null);
            }

            cl = new Cliente(rs.getInt(1),
                    rs.getString("c.nome"),
                    rs.getString("cpf"),
                    rs.getObject("nasc", LocalDate.class),
                    null,
                    rs.getString("telefone"),
                    rs.getString("endereco"),
                    rs.getString("bairro"),
                    rs.getString("cidade"),
                    rs.getString("cep"),
                    rs.getString("c.email"),
                    null,
                    u);

            if (!(rs.getString("sexo") == null)) {
                cl.setSexo(ESexo.valueOf(rs.getString("sexo")));
            }

            OrdemServico os = new OrdemServico(rs.getInt("id"),
                    rs.getTimestamp("inicio"),
                    rs.getTimestamp("fim"),
                    u,
                    cl,
                    rs.getString("descricao"),
                    rs.getDouble("valor"),
                    rs.getString("protocolo"));

            lista.add(os);

            while (rs.next()) {

                os = new OrdemServico(rs.getInt("id"),
                        rs.getTimestamp("inicio"),
                        rs.getTimestamp("fim"),
                        u,
                        cl,
                        rs.getString("descricao"),
                        rs.getDouble("valor"),
                        rs.getString("protocolo"));

                lista.add(os);

            }

            cl.setListaOS(lista);

            return cl;

        } else {

            return cl;

        }

    }

    public ArrayList<Cliente> preencheArrayObejetos(PreparedStatement pst) throws ClassNotFoundException, SQLException {

        ResultSet rs = pst.executeQuery();

        ArrayList<Cliente> listaC = new ArrayList<>();

        Cliente cl = null;

        Usuario u;

        while (rs.next()) {

            if (rs.getString("tipo").equals('A')) {
                u = new Administrador(null,
                        rs.getInt(1),
                        rs.getString("nome"),
                        rs.getString("login"),
                        rs.getString("senha"),
                        rs.getString("email"),
                        ETipoUser.A, null, null);
            } else {
                u = new Funcionario(rs.getInt(1),
                        rs.getString("nome"),
                        rs.getString("login"),
                        rs.getString("senha"),
                        rs.getString("email"),
                        ETipoUser.F, null, null);
            }

            cl = new Cliente(rs.getInt(1),
                    rs.getString("c.nome"),
                    rs.getString("cpf"),
                    rs.getObject("nasc", LocalDate.class),
                    null,
                    rs.getString("telefone"),
                    rs.getString("endereco"),
                    rs.getString("bairro"),
                    rs.getString("cidade"),
                    rs.getString("cep"),
                    rs.getString("c.email"),
                    null,
                    u);

            if (!(rs.getString("sexo") == null)) {
                cl.setSexo(ESexo.valueOf(rs.getString("sexo")));
            }

            listaC.add(cl);

        }

        return listaC;

    }

}
