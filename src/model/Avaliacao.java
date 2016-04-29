package model;

import java.util.Date;

public class Avaliacao {
    
    private int codigo;
    private Date dataAvaliacao;
    private Aluno aluno;
    private Funcionario funcionario;
    private int bracoEsquerdo;
    private int bracoDireito;
    private int peito;
    private int abdomen;
    private int pernaEsquerda;
    private int pernaDireita;

    public Avaliacao() {
    }

    public Avaliacao(Date dataAvaliacao, Aluno aluno, Funcionario funcionario,
                        int bracoEsquerdo, int bracoDireito, int peito, int abdomen,
                        int pernaEsquerda, int pernaDireita)
    {
        this.dataAvaliacao = dataAvaliacao;
        this.aluno = aluno;
        this.funcionario = funcionario;
        this.bracoEsquerdo = bracoEsquerdo;
        this.bracoDireito = bracoDireito;
        this.peito = peito;
        this.abdomen = abdomen;
        this.pernaEsquerda = pernaEsquerda;
        this.pernaDireita = pernaDireita;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getDataAvaliacao() {
        return dataAvaliacao;
    }

    public void setDataAvaliacao(Date dataAvaliacao) {
        this.dataAvaliacao = dataAvaliacao;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public int getBracoEsquerdo() {
        return bracoEsquerdo;
    }

    public void setBracoEsquerdo(int bracoEsquerdo) {
        this.bracoEsquerdo = bracoEsquerdo;
    }

    public int getBracoDireito() {
        return bracoDireito;
    }

    public void setBracoDireito(int bracoDireito) {
        this.bracoDireito = bracoDireito;
    }

    public int getPeito() {
        return peito;
    }

    public void setPeito(int peito) {
        this.peito = peito;
    }

    public int getAbdomen() {
        return abdomen;
    }

    public void setAbdomen(int abdomen) {
        this.abdomen = abdomen;
    }

    public int getPernaEsquerda() {
        return pernaEsquerda;
    }

    public void setPernaEsquerda(int pernaEsquerda) {
        this.pernaEsquerda = pernaEsquerda;
    }

    public int getPernaDireita() {
        return pernaDireita;
    }

    public void setPernaDireita(int pernaDireita) {
        this.pernaDireita = pernaDireita;
    }
}
