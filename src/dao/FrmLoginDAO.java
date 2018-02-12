package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jdbc.ConnectionFactory;

public class FrmLoginDAO {
	
	public boolean confirmAccount(String usuario, String senha) {
		Connection conn = new ConnectionFactory().getConnection();
		PreparedStatement ps;
		ResultSet rs;
		
		try {
			ps = conn.prepareStatement("select usu_nome, usu_senha from usuarios where usu_nome = ? and usu_senha = ?;");
			ps.setString(1, usuario);
			ps.setString(2, senha);
			
			rs = ps.executeQuery();
			
			if(rs.next()) {
				return true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
}