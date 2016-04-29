package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Conexao {
    
    private PreparedStatement ps;
    private ResultSet rs;
    private Connection con;
    
    public void conectar() throws Exception {
        String driver = "com.mysql.jdbc.Driver";
        Class.forName(driver);
	String url = "jdbc:mysql://localhost:3306/sgAcademia"; 
	String usuario = "root";
	String senha = "1234";
	con = DriverManager.getConnection(url, usuario, senha);
    }
    
    public void desconectar() throws Exception {
        if(con != null) con.close();
	if(ps != null) ps.close();
	if(rs != null) rs.close();
    }

    protected ResultSet getResultSet() {
        return this.rs;
    }

    protected Connection getConnection() {
        return this.con;
    }
    
    protected PreparedStatement getPreparedStatement() {
        return this.ps;
    }
}