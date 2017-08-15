package br.edu.facear.service;

import java.io.IOException;
import java.sql.SQLException;

import br.edu.facear.DAO.ClienteDAO;
import br.edu.facear.model.Cliente;

public class CadastrarService {
	public Cliente cadastrar(Cliente cliente){
		ClienteDAO dao = new ClienteDAO();
		Cliente c = null;
		
		
		
		try {
			c = dao.Cadastrar(cliente);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return c;
		
	}

}
