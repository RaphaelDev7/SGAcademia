package model;

public class Funcionario {
    
    private int codigo;
    private String nome;
    private String cpf;
    private String rg;
    private String funcao;
    private String fone;
    private String endereco;
    private String bairro;
    private Cidade cidade;
    private String cep;
    private String senha;
    private String observacoes;
    private String sexo;
    private String status;

    public Funcionario() {
    }

    public Funcionario(String nome, String cpf, String rg, String funcao, String fone,
                        String endereco, String bairro, Cidade cidade, String cep,
                        String senha, String observacoes, String sexo, String status)
    {
        this.nome = nome;
        this.cpf = cpf;
        this.rg = rg;
        this.funcao = funcao;
        this.fone = fone;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cidade = cidade;
        this.cep = cep;
        this.senha = senha;
        this.observacoes = observacoes;
        this.sexo = sexo;
        this.status = status;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int ocdigo) {
        this.codigo = ocdigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
    
    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
    
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
    public String getSexo() {
        return this.sexo;
    }
}
