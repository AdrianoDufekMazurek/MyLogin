package br.edu.facear.DAO;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import br.edu.facer.util.ConexaoUtil;

public class GenericDAO {
	private ConexaoUtil db = new ConexaoUtil();
	protected Connection connect;
	
	public void openConnection() throws ClassNotFoundException,IOException, SQLException{
		connect = db.getConnection();
	}
	public void closeConnection(){
		if(connect != null){
			try {
				connect.close();
			} catch (SQLException e) {
				System.out.println("Error on Closing Connection");
			}
		}
	}
}
