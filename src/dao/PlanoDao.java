package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.Plano;

public class PlanoDao extends Conexao {
    
    private PreparedStatement ps = getPreparedStatement();
    private Connection con = getConnection();
    private ResultSet rs = getResultSet();

    public void cadastrarPlano(Plano plano) throws Exception {
        conectar();
        
        String query = "INSERT INTO plano (plan_nome, plan_descricao, plan_valor, "
                        + "plan_condicoes) VALUES (?,?,?,?)";
        
        ps = con.prepareStatement(query);

        ps.setString(1, plano.getNome());
        ps.setString(2, plano.getDescricao());
        ps.setDouble(3, plano.getValor());
        ps.setString(4, plano.getCondicoes());
        ps.execute();
        
        desconectar();
    }
}