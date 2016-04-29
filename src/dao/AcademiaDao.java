package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.Academia;

public class AcademiaDao extends Conexao {
    
    private PreparedStatement ps = getPreparedStatement();
    private Connection con = getConnection();
    private ResultSet rs = getResultSet();
    
    public void cadastrarAcademia(Academia academia) throws Exception {
        conectar();
        
        String query = "INSERT INTO academia (acad_nome, acad_cnpj, acad_fone, "
                + "acad_site, acad_email, acad_endereco, acad_bairro, acad_cep "
                + "acad_observacao) VALUES (?,?,?,?,?,?,?,?,?)";
        
        ps = con.prepareStatement(query);

        ps.setString(1, academia.getNome());
        ps.setString(2, academia.getCnpj());
        ps.setString(3, academia.getFone());
        ps.setString(4, academia.getSite());
        ps.setString(5, academia.getEmail());
        ps.setString(6, academia.getEndereco());
        ps.setString(7, academia.getBairro());
        ps.setString(8, academia.getCep());
        ps.setString(9, academia.getObservacao());
        ps.execute();
        
        desconectar();
    }
    
}

/*
acad_id
acad_nome
acad_cnpj
acad_fone
acad_site
acad_email
acad_endereco
acad_bairro
acad_cep
acad_observacao
*/