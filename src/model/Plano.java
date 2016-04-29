package model;

public class Plano {
    
    private int codigo;
    private String nome;
    private String descricao;
    private double valor;
    private String condicoes;

    public Plano() {
    }

    public Plano(String nome, String descricao, double valor, String condicoes_plan)
    {
        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.condicoes = condicoes_plan;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getCondicoes() {
        return condicoes;
    }

    public void setCondicoes(String condicoes_plan) {
        this.condicoes = condicoes_plan;
    }
}
