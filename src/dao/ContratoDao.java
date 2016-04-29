package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.Contrato;

public class ContratoDao extends Conexao {
    
    private PreparedStatement ps = getPreparedStatement();
    private Connection con = getConnection();
    private ResultSet rs = getResultSet();
    
    public void cadastrarContrato(Contrato contrato) throws Exception {
        conectar();
        
        String query = "INSERT INTO contrato (cont_dataInicio, cont_termino, cont_observacao) "
                + "VALUES (?,?,?)";
        
        ps = con.prepareStatement(query);

        ps.setString(1, contrato.getDataInicio().toString());
        ps.setString(2, contrato.getDataTermino().toString());
        ps.setString(3, contrato.getObservacoes());
        ps.execute();
        
        desconectar();
    }
}

