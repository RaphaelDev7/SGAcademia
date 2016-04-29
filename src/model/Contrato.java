package model;

import java.util.Date;

public class Contrato {
    
    private int codigo;
    private Academia academia;
    private Aluno aluno;
    private Date dataInicio;
    private Date dataTermino;
    private Plano plano;
    private String observacoes;

    public Contrato() {
    }

    public Contrato(Academia academia, Aluno aluno, Date dataInicio, Date dataTermino, Plano plano, String observacoes) {
        this.academia = academia;
        this.aluno = aluno;
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
        this.plano = plano;
        this.observacoes = observacoes;
    }

    public int getCodigo() {
        return codigo;
    }

    public Academia getAcademia() {
        return academia;
    }

    public void setAcademia(Academia academia) {
        this.academia = academia;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(Date dataTermino) {
        this.dataTermino = dataTermino;
    }

    public Plano getPlano() {
        return plano;
    }

    public void setPlano(Plano plano) {
        this.plano = plano;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }
}