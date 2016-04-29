package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.Avaliacao;

public class AvaliacaoDao extends Conexao {
    
    private PreparedStatement ps = getPreparedStatement();
    private Connection con = getConnection();
    private ResultSet rs = getResultSet();
    
    public void cadastrarAvaliacao(Avaliacao avaliacao) throws Exception {
        conectar();
        
        String query = "INSERT INTO avaliacao (aval_date, aval_bracoEsquerdo, aval_bracoDireito"
                        + "aval_peito, aval_abdomen, aval_pernaEsquerda, aval_pernaDireita) "
                        + "VALUES (?,?,?,?,?,?,?)";
        
        ps = con.prepareStatement(query);

        ps.setString(1, avaliacao.getDataAvaliacao().toString());
        ps.setDouble(2, avaliacao.getBracoEsquerdo());
        ps.setDouble(3, avaliacao.getBracoDireito());
        ps.setDouble(4, avaliacao.getPeito());
        ps.setDouble(5, avaliacao.getAbdomen());
        ps.setDouble(6, avaliacao.getPernaEsquerda());
        ps.setDouble(7, avaliacao.getPernaDireita());
        ps.execute();
        
        desconectar();
    }
    
}

/*
aval_id
aval_date
aval_bracoEsquerdo
aval_bracoDireito
aval_peito
aval_abdomen
aval_pernaEsquerda
aval_pernaDireita
*/