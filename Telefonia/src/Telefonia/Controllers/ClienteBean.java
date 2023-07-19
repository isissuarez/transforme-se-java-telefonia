package Telefonia.Controllers;



import Telefonia.domains.Cliente;
import Telefonia.models.ClienteDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class ClienteBean {
    public List<Cliente> listarclientes() throws SQLException {
        List<Cliente> clientes = new ArrayList();
        ClienteDAO clienteDAO = new ClienteDAO();
        
         clientes = clienteDAO.listarClientes();
        
        return clientes;    
           
       
    }
    public void inserirCliente(Cliente cliente) throws SQLException {
    ClienteDAO clienteDAO = new ClienteDAO();
    clienteDAO.inserirCliente(cliente);
    }
    public void editarCliente(Cliente cliente) throws SQLException {
     ClienteDAO clienteDAO = new ClienteDAO();
    clienteDAO.editarCliente(cliente);   
    }
    
    
    public void excluirCliente(Cliente cliente) throws SQLException {
        ClienteDAO clienteDAO = new ClienteDAO();
        
        clienteDAO.excluirCliente(cliente);
    }
    
}
