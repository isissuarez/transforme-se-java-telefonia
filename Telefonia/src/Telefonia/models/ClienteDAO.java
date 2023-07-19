/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Telefonia.models;

import Telefonia.domains.Cliente;
import Telefonia.utils.DBConnection;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

/**
 *
 * @author DELL
 */
public class ClienteDAO {

    Connection conexao;    
    
    public List<Cliente> listarClientes() throws SQLException {
        List<Cliente> clientes = new ArrayList<>();
        
        conexao = DBConnection.getConnection();
        
        String sql = "SELECT * FROM usuarios ORDER BY nome";
        PreparedStatement stmt;        
        
        stmt = this.conexao.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        
        while (rs.next()) {
            Cliente cliente = new Cliente(rs.getString("nome"), rs.getString("sexo").charAt(0),
                    rs.getString("email"), rs.getString("estado_civil"));
            cliente.setId(rs.getInt("codigo"));
            
            clientes.add(cliente);
        }
        rs.close();
        stmt.close();
        conexao.close();
        
        return clientes;
    }
    
    public void inserirCliente(Cliente cliente) throws SQLException {
        String sql = "INSERT INTO usuarios (nome, sexo, email, `estado_civil`) VALUES (?, ?, ?, ?)";
        conexao = DBConnection.getConnection();
        PreparedStatement stmt = null;        
        
        stmt = this.conexao.prepareStatement(sql);
        
        stmt.setString(1, cliente.getNome());
        stmt.setString(2, String.valueOf(cliente.getSexo()));
        stmt.setString(3, cliente.getEmail());
        stmt.setString(4, cliente.getEstadoCivil());
        
        stmt.execute();
        
        stmt.close();
        conexao.close();
        
    }

    public void editarCliente(Cliente cliente) throws SQLException {
        String sql = "UPDATE usuarios SET nome = ?,  sexo = ?,  email = ?, estado_civil = ? WHERE codigo = ?";
        conexao = DBConnection.getConnection();
        PreparedStatement stmt = null;        
        
        stmt = conexao.prepareStatement(sql);
        
        stmt.setString(1, cliente.getNome());
        stmt.setString(2, String.valueOf(cliente.getSexo()));
        stmt.setString(3, cliente.getEmail());
        stmt.setString(4, cliente.getEstadoCivil());
        stmt.setInt(5, cliente.getId());
        stmt.execute();
        
        stmt.close();
        conexao.close();
        
    }
    
    public void excluirCliente(Cliente cliente) throws SQLException {
        String sql = "DELETE FROM usuarios WHERE codigo = ?";
      
       conexao = DBConnection.getConnection();
        PreparedStatement stmt = null;        
        
        stmt = conexao.prepareStatement(sql);        

        stmt.setInt(1, cliente.getId());
        stmt.execute();
        
        stmt.close();
        conexao.close(); 
    }
    
}
