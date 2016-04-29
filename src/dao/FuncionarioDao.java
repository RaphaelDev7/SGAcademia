package dao;

import java.sql.PreparedStatement;
import model.Funcionario;
import java.sql.Connection;
import java.sql.ResultSet;

public class FuncionarioDao extends Conexao {
    
    private PreparedStatement ps = getPreparedStatement();
    private final Connection con = getConnection();
    private ResultSet rs = getResultSet();
    
    public void cadastrarFuncionario(Funcionario funcionario) throws Exception {
        conectar();
        
        String query = "INSERT INTO funcionarios (func_nome, func_cpf, func_rg, "
                        + "func_funcao, func_fone, func_endereco, func_bairro, "
                        + "func_cep, func_observacao, func_sexo "
                        + "VALUES (?,?,?,?,?,?,?,?,?,?) ";
				
        ps = con.prepareStatement(query);

        ps.setString(1, funcionario.getNome());
        ps.setString(2, funcionario.getCpf());
        ps.setString(3, funcionario.getRg());
        ps.setString(4, funcionario.getFuncao());
        ps.setString(5, funcionario.getFone());
        ps.setString(6, funcionario.getEndereco());
        ps.setString(7, funcionario.getBairro());
        ps.setString(8, funcionario.getCep());
        ps.setString(9, funcionario.getObservacoes());
        ps.setString(10, funcionario.getSexo());
        ps.execute();
        
        desconectar();
    }
    
    public void atualizarFuncionario(Funcionario funcionario) throws Exception {
        conectar();
        String query = "UPATE funcionario SET func_nome = ?, func_cpf = ? "
                        + "func_rg = ?, func_funcao = ?, func_fone = ?, func_endereco = ?, "
                        + "func_bairro = ?, func_cep = ?, func_observacao = ?, func_sexo = ? "
                        + "WHERE func_id = ?";
        
        ps = con.prepareStatement(query);
        ps.setString(1, funcionario.getNome());
        ps.setString(2, funcionario.getCpf());
        ps.setString(3, funcionario.getRg());
        ps.setString(4, funcionario.getFuncao());
        ps.setString(5, funcionario.getFone());
        ps.setString(6, funcionario.getEndereco());
        ps.setString(7, funcionario.getBairro());
        ps.setString(8, funcionario.getCep());
        ps.setString(9, funcionario.getObservacoes());
        ps.setString(10, funcionario.getSexo());
        ps.setInt(11, funcionario.getCodigo());
        ps.executeUpdate();
        
        desconectar();
    }

    public Funcionario obterFuncionarioPor(int codigo) throws Exception {
        conectar();
        String query = "SELECT * FROM funcionario WHERE func_id = ?";
        
        ps = con.prepareStatement(query);
        ps.setInt(1, codigo);
	rs = ps.executeQuery();
        
        Funcionario funcionario = new Funcionario();
        if(rs.next()){
            funcionario.setCodigo(rs.getInt("func_id"));
            funcionario.setNome(rs.getString("func_nome"));
            funcionario.setCpf(rs.getString("func_cpf"));
            funcionario.setRg(rs.getString("func_rg"));
            funcionario.setFuncao(rs.getString("func_funcao"));
            funcionario.setFone(rs.getString("func_fone"));
            funcionario.setEndereco(rs.getString("func_endereco"));
            funcionario.setBairro(rs.getString("func_bairro"));
            funcionario.setCep(rs.getString("func_cep"));
            funcionario.setObservacoes(rs.getString("func_observacao"));
            funcionario.setSexo(rs.getString("func_sexo"));
        }
        
        desconectar();
        return funcionario;
    }

    public Funcionario obterFuncionarioPor(String nome) throws Exception {
        conectar();
        String query = "SELECT * FROM funcionario WHERE func_nome = ?";
        
        ps = con.prepareStatement(query);
        ps.setString(1, nome);
	rs = ps.executeQuery();
        
        Funcionario funcionario = new Funcionario();
        if(rs.next()){
            funcionario.setCodigo(rs.getInt("func_id"));
            funcionario.setNome(rs.getString("func_nome"));
            funcionario.setCpf(rs.getString("func_cpf"));
            funcionario.setRg(rs.getString("func_rg"));
            funcionario.setFuncao(rs.getString("func_funcao"));
            funcionario.setFone(rs.getString("func_fone"));
            funcionario.setEndereco(rs.getString("func_endereco"));
            funcionario.setBairro(rs.getString("func_bairro"));
            funcionario.setCep(rs.getString("func_cep"));
            funcionario.setObservacoes(rs.getString("func_observacao"));
            funcionario.setSexo(rs.getString("func_sexo"));
        }
        
        desconectar();
        return funcionario;
    }
    
    public void deletarAluno(int codigo) throws Exception {
        conectar();
        String query = "UPDATE funcionario SET func_status = ? WHERE func_id = ?";
        ps = con.prepareStatement(query);
        ps.setString(1, "I");
        ps.setInt(2, codigo);
        desconectar();
    }
}
