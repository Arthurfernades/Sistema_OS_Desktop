/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.br.vianna.sistemaos.DAO.impl;

import com.br.vianna.sistemaos.DAO.IGenericsDAO;
import com.br.vianna.sistemaos.banco.ConnectionFactory;
import com.br.vianna.sistemaos.model.Administrador;
import com.br.vianna.sistemaos.model.Funcionario;
import com.br.vianna.sistemaos.model.OrdemServico;
import com.br.vianna.sistemaos.model.Usuario;
import com.br.vianna.sistemaos.model.Cliente;
import com.br.vianna.sistemaos.model.tipos.ESexo;
import com.br.vianna.sistemaos.model.tipos.ETipoUser;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.ArrayList;

/**
 *
 * @author arthu
 */
public class UsuarioDAO implements IGenericsDAO<Usuario, Integer> {

    @Override
    public void inserir(Usuario user) throws ClassNotFoundException, SQLException {

        Connection c = ConnectionFactory.getConnection();

        String sql = "INSERT INTO usuario (nome, login, senha, email, tipo)\n"
                + "VALUES (?, ?, md5(?), ?, ?);";

        PreparedStatement pst = c.prepareStatement(sql);

        pst.setString(1, user.getNome());
        pst.setString(2, user.getLogin());
        pst.setString(3, user.getSenha());
        pst.setString(4, user.getEmail());
        pst.setString(5, user.getTipo().toString());

        pst.execute();
    }

    @Override
    public void editar(Usuario user) throws ClassNotFoundException, SQLException {

        Connection c = ConnectionFactory.getConnection();

        String sql = "UPDATE usuario\n"
                + "SET nome = ?, login = ?, senha = ?, email = ?, tipo = ?\n"
                + "WHERE id_usuario = ?;";

        PreparedStatement pst = c.prepareStatement(sql);

        pst.setString(1, user.getNome());
        pst.setString(2, user.getLogin());
        pst.setString(3, user.getSenha());
        pst.setString(4, user.getEmail());
        pst.setString(5, user.getTipo().toString());
        pst.setInt(6, user.getId());

        pst.execute();

    }

    /**
     *
     * @param key
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    @Override
    public void apagar(Integer key) throws ClassNotFoundException, SQLException {

        Connection c = ConnectionFactory.getConnection();

        String sql = "DELETE FROM usuario\n"
                + "WHERE id_usuario = ?;";

        PreparedStatement pst = c.prepareStatement(sql);

        pst.setInt(1, key);

        pst.execute();

    }

    /**
     *
     * @return @throws ClassNotFoundException
     * @throws SQLException
     */
    @Override
    public int quantidade() throws ClassNotFoundException, SQLException {

        Connection c = ConnectionFactory.getConnection();

        String sql = "SELECT count(*)\n"
                + "FROM usuario;";

        PreparedStatement pst = c.prepareStatement(sql);

        ResultSet rs = pst.executeQuery();

        rs.next();

        return rs.getInt(1);

    }

    @Override
    public Usuario buscarPorChave(Integer key) throws ClassNotFoundException, SQLException {

        Connection c = ConnectionFactory.getConnection();

        String sql = "SELECT u.*, c.*, os.*\n"
                + "FROM usuario u\n"
                + "left join cliente c on c.id_usuario = u.id_usuario\n"
                + "left join ordem_servico os on os.id_funcionario = u.id_usuario\n"
                + "WHERE id_usuario = ?\n"
                + "order by u.nome asc;";

        PreparedStatement pst = c.prepareStatement(sql);

        pst.setInt(1, key);

        return preencheObejetos(pst);
    }

    @Override
    public ArrayList<Usuario> buscarTodos() throws ClassNotFoundException, SQLException {

        Connection c = ConnectionFactory.getConnection();

        String sql = "SELECT u.*, c.*, os.*\n"
                + "FROM usuario u\n"
                + "LEFT join cliente c on c.id_usuario = u.id_usuario\n"
                + "LEFT join ordem_servico os on os.id_funcionario = u.id_usuario\n"
                + "order by u.nome asc;";

        PreparedStatement pst = c.prepareStatement(sql);

        return preencheArrayObjetos(pst);

    }

    public ArrayList<Usuario> buscarPorNome(String nome) throws ClassNotFoundException, SQLException {

        Connection c = ConnectionFactory.getConnection();

        String sql = "SELECT u.*, c.*, os.*\n"
                + "FROM usuario u\n"
                + "left join cliente c on c.id_usuario = u.id_usuario\n"
                + "left join ordem_servico os on os.id_funcionario = u.id_usuario\n"
                + "WHERE u.nome LIKE ?\n"
                + "order by c.nome asc";

        PreparedStatement pst = c.prepareStatement(sql);

        pst.setString(1, nome + "%");

        return preencheArrayObjetos(pst);
    }

    public Usuario buscarPorLoginESenha(String login, String senha) throws ClassNotFoundException, SQLException {

        Connection c = ConnectionFactory.getConnection();

        String sql = "SELECT u.*, c.*, os.*\n"
                + "FROM usuario u\n"
                + "left join cliente c on c.id_usuario = u.id_usuario\n"
                + "left join ordem_servico os on os.id_funcionario = u.id_usuario\n"
                + "WHERE login = ? and senha = md5(?);";

        PreparedStatement pst = c.prepareStatement(sql);

        pst.setString(1, login);
        pst.setString(2, senha);

        return preencheObejetos(pst);

    }

    public Usuario buscarPorLogin(String login) throws ClassNotFoundException, SQLException {

        Connection c = ConnectionFactory.getConnection();

        String sql = "SELECT u.*, c.*, os.*\n"
                + "FROM usuario u\n"
                + "left join cliente c on c.id_usuario = u.id_usuario\n"
                + "left join ordem_servico os on os.id_funcionario = u.id_usuario\n"
                + "WHERE login = ?;";

        PreparedStatement pst = c.prepareStatement(sql);

        pst.setString(1, login);

        return preencheObejetos(pst);

    }

    public Usuario buscarPorEmail(String email) throws ClassNotFoundException, SQLException {

        Connection c = ConnectionFactory.getConnection();

        String sql = "SELECT u.*, c.*, os.*\n"
                + "FROM usuario u\n"
                + "left join cliente c on c.id_usuario = u.id_usuario\n"
                + "left join ordem_servico os on os.id_funcionario = u.id_usuario\n"
                + "WHERE u.email = ?;";

        PreparedStatement pst = c.prepareStatement(sql);

        pst.setString(1, email);

        return preencheObejetos(pst);

    }

    public Usuario preencheObejetos(PreparedStatement pst) throws ClassNotFoundException, SQLException {

        ResultSet rs = pst.executeQuery();

        Cliente cl;

        Usuario u = null;

        ArrayList<OrdemServico> listaOS = new ArrayList<>();
        ArrayList<Cliente> listaCliente = new ArrayList<>();

        if (rs.next()) {

            if (rs.getString("tipo").equals('A')) {
                u = new Administrador(null,
                        rs.getInt(1),
                        rs.getString("u.nome"),
                        rs.getString("login"),
                        rs.getString("senha"),
                        rs.getString("u.email"),
                        ETipoUser.A, null, null);
            } else {
                u = new Funcionario(rs.getInt(1),
                        rs.getString("u.nome"),
                        rs.getString("login"),
                        rs.getString("senha"),
                        rs.getString("u.email"),
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
                    null,
                    null,
                    rs.getString("descricao"),
                    rs.getDouble("valor"),
                    rs.getString("protocolo"));

            listaOS.add(os);

            while (rs.next()) {

                os = new OrdemServico(rs.getInt("id"),
                        rs.getTimestamp("inicio"),
                        rs.getTimestamp("fim"),
                        u,
                        cl,
                        rs.getString("descricao"),
                        rs.getDouble("valor"),
                        rs.getString("protocolo"));

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

                listaOS.add(os);
                listaCliente.add(cl);

            }

            u.setOS(listaOS);
            u.setClientes(listaCliente);

            return u;

        } else {

            return u;

        }

    }

    public ArrayList<Usuario> preencheArrayObjetos(PreparedStatement pst) throws ClassNotFoundException, SQLException {

        ResultSet rs = pst.executeQuery();

        ArrayList<Usuario> listaU = new ArrayList<>();

        Usuario u = null;

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

            listaU.add(u);

        }

        return listaU;

    }

}
