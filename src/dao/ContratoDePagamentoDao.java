package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.ContratoDePagamento;

public class ContratoDePagamentoDao extends Conexao {
    
    private PreparedStatement ps = getPreparedStatement();
    private Connection con = getConnection();
    private ResultSet rs = getResultSet();
    
    public void cadastrarContratoDePagamento(ContratoDePagamento contrato) throws Exception {
        conectar();
        
        String query = "INSERT INTO contratoPagamento (cpag_dataVencimento, cpag_liquidacao "
                        + "cpag_nDocPag, cpag_historico, cpag_valor, cpag_contratoPagamentocol) "
                        + "VALUES (?,?,?,?,?,?)";
        
        ps = con.prepareStatement(query);
        /*
        ps.setString(1, contrato.getDataVencimento());
        ps.setString(2, contrato.getLiquidacao_cpag());
        ps.setString(3, contrato.getN_doc_cpag());
        ps.setString(4, contrato.getHistorico_cpag());
        ps.setString(5, contrato.getValor_cpag());
        ps.setString(6, contrato.getCodigo_cont_cpag());
        */
        desconectar();
    }
}