/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.br.vianna.sistemaos.DAO.impl;

import com.br.vianna.sistemaos.DAO.IGenericsDAO;
import com.br.vianna.sistemaos.banco.ConnectionFactory;
import com.br.vianna.sistemaos.model.OrdemServico;
import com.br.vianna.sistemaos.model.Usuario;
import com.br.vianna.sistemaos.model.Administrador;
import com.br.vianna.sistemaos.model.Funcionario;
import com.br.vianna.sistemaos.model.Cliente;
import com.br.vianna.sistemaos.model.tipos.ESexo;
import com.br.vianna.sistemaos.model.tipos.ETipoUser;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

/**
 *
 * @author arthu
 */
public class OrdemServicoDAO implements IGenericsDAO<OrdemServico, Integer> {

    public static void main(String[] args) {

//        OrdemServico os = new OrdemServico(0, inicio, null, funcionario, cliente, descricao, 0, protocolo)
    }

    @Override
    public void inserir(OrdemServico os) throws ClassNotFoundException, SQLException {

        Connection c = ConnectionFactory.getConnection();

        String sql = "INSERT INTO ordem_servico\n"
                + "(inicio, fim, id_funcionario, id_cliente, descricao, valor, protocolo)\n"
                + "VALUES (?, ?, ?, ?, ?, ?, ?);";

        PreparedStatement pst = c.prepareStatement(sql);

        pst.setObject(1, os.getInicio());
        pst.setObject(2, os.getFim());
        pst.setInt(3, os.getFuncionario().getId());
        pst.setInt(4, os.getCliente().getId());
        pst.setString(5, os.getDescricao());
        pst.setDouble(6, os.getValor());
        pst.setString(7, os.getProtocolo());

        pst.execute();

    }

    @Override
    public void editar(OrdemServico os) throws ClassNotFoundException, SQLException {

        Connection c = ConnectionFactory.getConnection();

        String sql = "UPDATE ordem_servico\n"
                + "SET\n"
                + "fim = ?\n"
                + "WHERE id = ?;";
        
//        , id_funcionario = ?, id_cliente = ?, descricao = ?, valor = ?

        PreparedStatement pst = c.prepareStatement(sql);

        pst.setObject(1, os.getFim());
//        pst.setInt(2, os.getFuncionario().getId());
//        pst.setInt(3, os.getCliente().getId());
//        pst.setString(4, os.getDescricao());
//        pst.setDouble(5, os.getValor());
        pst.setInt(2, os.getId());

        pst.execute();

    }

    @Override
    public void apagar(Integer key) throws ClassNotFoundException, SQLException {

        Connection c = ConnectionFactory.getConnection();

        String sql = "DELETE FROM ordem_servico\n"
                + "WHERE id = ?;";

        PreparedStatement pst = c.prepareStatement(sql);

        pst.setInt(1, key);

        pst.execute();

    }

    @Override
    public int quantidade() throws ClassNotFoundException, SQLException {

        Connection c = ConnectionFactory.getConnection();

        String sql = "SELECT count(*)\n"
                + "FROM ordem_servico;";

        PreparedStatement pst = c.prepareStatement(sql);

        ResultSet rs = pst.executeQuery();

        rs.next();

        return rs.getInt(1);

    }

    @Override
    public OrdemServico buscarPorChave(Integer key) throws ClassNotFoundException, SQLException {

        Connection c = ConnectionFactory.getConnection();

        String sql = "SELECT os.*, c.*, u.*\n"
                + "FROM ordem_servico os\n"
                + "left join usuario u on u.id_usuario = os.id_usuario\n"
                + "left join cliente c on c.id_cliente = os.id_cliente\n"
                + "WHERE id = ?\n"
                + "order by protocolo desc";

        PreparedStatement pst = c.prepareStatement(sql);

        pst.setInt(1, key);

        return preencheObejetos(pst);

    }

    public OrdemServico buscarPorProtocolo(String protocolo) throws ClassNotFoundException, SQLException {

        Connection c = ConnectionFactory.getConnection();

        String sql = "SELECT os.*, c.*, u.*\n"
                + "FROM ordem_servico os\n"
                + "left join usuario u on u.id_usuario = os.id_funcionario\n"
                + "left join cliente c on c.id_cliente = os.id_cliente\n"
                + "WHERE protocolo = ?\n"
                + "order by protocolo desc;";

        PreparedStatement pst = c.prepareStatement(sql);

        pst.setString(1, protocolo);

        return preencheObejetos(pst);

    }

    @Override
    public ArrayList<OrdemServico> buscarTodos() throws ClassNotFoundException, SQLException {

        Connection c = ConnectionFactory.getConnection();

        String sql = "SELECT os.*, c.*, u.*\n"
                + "FROM ordem_servico os\n"
                + "left join usuario u on u.id_usuario = os.id_funcionario\n"
                + "left join cliente c on c.id_cliente = os.id_cliente\n"
                + "order by protocolo desc;";

        PreparedStatement pst = c.prepareStatement(sql);

        return preencheArrayObejetos(pst);

    }

    public ArrayList<OrdemServico> buscarPorIdCliente(Integer id) throws ClassNotFoundException, SQLException {

        Connection c = ConnectionFactory.getConnection();

        String sql = "SELECT os.*, c.*, u.*\n"
                + "FROM ordem_servico os\n"
                + "left join usuario u on u.id_usuario = os.id_funcionario\n"
                + "left join cliente c on c.id_cliente = os.id_cliente\n"
                + "WHERE id_cliente = ?\n"
                + "order by protocolo desc;";

        PreparedStatement pst = c.prepareStatement(sql);

        pst.setInt(1, id);

        return preencheArrayObejetos(pst);

    }

    public ArrayList<OrdemServico> buscarPorIdFuncionario(Integer id) throws ClassNotFoundException, SQLException {

        Connection c = ConnectionFactory.getConnection();

        String sql = "SELECT os.*, c.*, u.*\n"
                + "FROM ordem_servico os\n"
                + "left join usuario u on u.id_usuario = os.id_funcionario\n"
                + "left join cliente c on c.id_cliente = os.id_cliente\n"
                + "WHERE id_funcionario = ?\n"
                + "order by protocolo desc;";

        PreparedStatement pst = c.prepareStatement(sql);

        pst.setInt(1, id);

        return preencheArrayObejetos(pst);

    }

    public OrdemServico preencheObejetos(PreparedStatement pst) throws ClassNotFoundException, SQLException {

        ResultSet rs = pst.executeQuery();

        Cliente cl;

        Usuario u;

        OrdemServico os = null;

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

            os = new OrdemServico(rs.getInt("id"),
                    rs.getTimestamp("inicio"),
                    rs.getTimestamp("fim"),
                    u,
                    cl,
                    rs.getString("descricao"),
                    rs.getDouble("valor"),
                    rs.getString("protocolo"));

            return os;

        } else {

            return os;

        }

    }

    public ArrayList<OrdemServico> preencheArrayObejetos(PreparedStatement pst) throws ClassNotFoundException, SQLException {

        ResultSet rs = pst.executeQuery();

        Cliente cl;

        Usuario u;

        OrdemServico os;

        ArrayList<OrdemServico> listaOS = new ArrayList<>();

        while (rs.next()) {

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

            os = new OrdemServico(rs.getInt("id"),
                    rs.getTimestamp("inicio"),
                    rs.getTimestamp("fim"),
                    u,
                    cl,
                    rs.getString("descricao"),
                    rs.getDouble("valor"),
                    rs.getString("protocolo"));

            listaOS.add(os);

        }

        return listaOS;

    }

}
