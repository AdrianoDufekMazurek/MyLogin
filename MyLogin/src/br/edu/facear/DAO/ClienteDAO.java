package br.edu.facear.DAO;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.edu.facear.model.Cliente;

public class ClienteDAO extends GenericDAO{
	private PreparedStatement ps;
	private String LOGIN_SQL="SELECT * FROM CLIENTE WHERE EMAIL=? AND SENHA=?;";
	private String Cadastrar = "INSERT INTO CLIENTE (nome, cpf, email, senha) values(?,?,?,?);"; 
	
	public Cliente autenticar(String email, String senha) throws ClassNotFoundException, IOException, SQLException{
		Cliente c =null;
		//Abrir Conexão
		openConnection();
		
		//Preparar script
		ps = connect.prepareStatement(LOGIN_SQL);
		ps.setString(1, email);
		ps.setString(2, senha);
		
		ResultSet rs = ps.executeQuery();
		
		if(rs !=null){
			while(rs.next()){
				c = new Cliente(rs.getInt("id"), rs.getString("nome"), rs.getString("cpf"),rs.getString("email"),rs.getString("senha"));
			}
		}
		
		//Fechar a conexao
		closeConnection();
		return c;
	}
	public Cliente Cadastrar(Cliente cliente) throws ClassNotFoundException, IOException, SQLException{
		openConnection();
		ps = connect.prepareStatement(Cadastrar);
		ps.setString(1, cliente.getNome());
		ps.setString(2, cliente.getCpf());
		ps.setString(3, cliente.getEmail());
		ps.setString(4, cliente.getSenha());
		closeConnection();
		
		return cliente;
		
	}
}
