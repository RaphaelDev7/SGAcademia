package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.Aluno;

public class AlunoDao extends Conexao {
    
    private PreparedStatement ps = getPreparedStatement();
    private Connection con = getConnection();
    private ResultSet rs = getResultSet();
    
    public void cadastrarAluno(Aluno aluno) throws Exception {
        conectar();
        
        String query = "INSERT INTO alunos (alun_nome, alun_cpf, alun_celular, "
                        + "alun_residencial, alun_email, alun_endereco, alun_bairro, "
                        + "alun_cep, alun_dataNascimento, alun_observacao, alun_status, alun_sexo"
                        + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?) ";
				
        ps = con.prepareStatement(query);

        ps.setString(1, aluno.getNome());
        ps.setString(2, aluno.getCpf());
        ps.setString(3, aluno.getCelular());
        ps.setString(4, aluno.getFoneResidencial());
        ps.setString(5, aluno.getEmail());
        ps.setString(6, aluno.getEndereco());
        ps.setString(7, aluno.getBairro());
        ps.setString(8, aluno.getCep());
        ps.setString(9, aluno.getDataNascimento().toString());
        ps.setString(10, aluno.getObservacao());
        ps.setString(11, aluno.getStatus());
        ps.setString(12, aluno.getSexo());
        ps.execute();
        
        desconectar();
    }
    
    public void atualizarAluno(Aluno aluno) throws Exception {
        conectar();
        String query = "UPDATE aluno SET alun_nome = ?, alun_cpf = ?, alun_celular = ?, "
                       +"alun_residencial = ?, alun_email = ?, alun_endereco = ?, "
                       +"alun_bairro = ?, alun_cep = ?, alun_dataNascimento = ? "
                       +"alun_observacao = ?, alun_status = ?, alun_sexo = ?"
                       +"WHERE alun_id = ?";
        
        ps = con.prepareStatement(query);
        ps.setString(1, aluno.getNome());
        ps.setString(2, aluno.getCpf());
        ps.setString(3, aluno.getCelular());
        ps.setString(4, aluno.getFoneResidencial());
        ps.setString(5, aluno.getEmail());
        ps.setString(6, aluno.getEndereco());
        ps.setString(7, aluno.getBairro());
        ps.setString(8, aluno.getCep());
        ps.setString(9, aluno.getDataNascimento().toString());
        ps.setString(10, aluno.getObservacao());
        ps.setString(11, aluno.getStatus());
        ps.setString(12, aluno.getSexo());
        ps.setInt(13, aluno.getCodigo());
        ps.executeUpdate();
        
        desconectar();
    }
    
    public Aluno obterAlunoPor(int codigo) throws Exception {
        conectar();
        String query = "SELECT * FROM aluno WHERE alun_id = ?";
        ps = con.prepareStatement(query);
        
        ps.setInt(1, codigo);
	rs = ps.executeQuery();
        
        Aluno aluno = new Aluno();
        if(rs.next()) {
            aluno.setCodigo(rs.getInt("alun_id"));
            aluno.setNome(rs.getString("alun_nome"));
            aluno.setCpf(rs.getString("alun_cpf"));
            aluno.setCelular(rs.getString("alun_celular"));
            aluno.setFoneResidencial(rs.getString("alun_residencial"));
            aluno.setEmail(rs.getString("alun_email"));
            aluno.setEndereco(rs.getString("alun_endereco"));
            aluno.setBairro(rs.getString("alun_bairro"));
            aluno.setCep(rs.getString("alun_cep"));
            aluno.setDataNascimento(rs.getDate("alun_dataNascimento"));
            aluno.setObservacao(rs.getString("alun_observacao"));
            aluno.setStatus(rs.getString("alun_status"));
            aluno.setSexo(rs.getString("alun_sexo"));
        }
        desconectar();
        
        return aluno;
    }
    
    public Aluno obterAlunoPor(String nome) throws Exception {
        conectar();
        String query = "SELECT * FROM aluno WHERE alun_nome = ?";
        ps = con.prepareStatement(query);
        
        ps.setString(1, nome);
	rs = ps.executeQuery();
        
        Aluno aluno = new Aluno();
        if(rs.next()) {
            aluno.setCodigo(rs.getInt("alun_id"));
            aluno.setNome(rs.getString("alun_nome"));
            aluno.setCpf(rs.getString("alun_cpf"));
            aluno.setCelular(rs.getString("alun_celular"));
            aluno.setFoneResidencial(rs.getString("alun_residencial"));
            aluno.setEmail(rs.getString("alun_email"));
            aluno.setEndereco(rs.getString("alun_endereco"));
            aluno.setBairro(rs.getString("alun_bairro"));
            aluno.setCep(rs.getString("alun_cep"));
            aluno.setDataNascimento(rs.getDate("alun_dataNascimento"));
            aluno.setObservacao(rs.getString("alun_observacao"));
            aluno.setStatus(rs.getString("alun_status"));
            aluno.setSexo(rs.getString("alun_sexo"));
        }
        desconectar();
        
        return aluno;
    }
    
    public void deletarAluno(int codigo) throws Exception {
        conectar();
        String query = "UPDATE aluno SET alun_status = ? WHERE alun_id = ?";
        ps = con.prepareStatement(query);
        ps.setString(1, "I");
        ps.setInt(2, codigo);
        desconectar();
    }
    
}