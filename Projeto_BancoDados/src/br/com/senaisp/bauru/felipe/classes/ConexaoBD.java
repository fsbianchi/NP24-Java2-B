package br.com.senaisp.bauru.felipe.classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {
	private static ConexaoBD instancia = null;
	private Connection conn;
	// colocando o constructor como privado para criar somente aqui
	
	
	private ConexaoBD() throws SQLException {
		conn = DriverManager.getConnection("jdbc:sqlite:C:\\\\Javalibs\\\\dados\\\\NP24_JAVA2_B.DB");
	}
	public static ConexaoBD getIntancia() throws SQLException{
		if (instancia == null) {   
			instancia = new ConexaoBD();
		}
		return instancia;
	}
	public Connection getConn() {
		return conn;
	}
}
