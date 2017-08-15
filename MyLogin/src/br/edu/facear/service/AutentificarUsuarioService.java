package br.edu.facear.service;

import java.io.IOException;
import java.sql.SQLException;

import br.edu.facear.DAO.ClienteDAO;
import br.edu.facear.model.Cliente;

public class AutentificarUsuarioService {
	public Cliente autenticar(String email, String senha){
		ClienteDAO dao= new ClienteDAO();
		Cliente c= null;
		try {
			c = dao.autenticar(email, senha);
		} catch (ClassNotFoundException | IOException | SQLException e) {
			e.printStackTrace();
		}
		
		return c;
	}
}
