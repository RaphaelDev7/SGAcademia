package model;

import java.util.Date;

public class ContratoDePagamento {
    
    private int codigo;
    private int codigo_cont_cpag; // Código de pagamento menor da mensalidade
    private int codigo_cpst_cpag; //depois comenta ai
    private Date dataVencimento;
    private Date liquidacao_cpag;
    private String n_doc_cpag;
    private String historico_cpag;
    private double valor_cpag;

    public ContratoDePagamento() {
    }

    public ContratoDePagamento(int codigo_cont_cpag, int codigo_cpst_cpag, Date dataVencimento,
                                Date liquidacao_cpag, String n_doc_cpag, String historico_cpag,
                                double valor_cpag)
    {
        this.codigo_cont_cpag = codigo_cont_cpag;
        this.codigo_cpst_cpag = codigo_cpst_cpag;
        this.dataVencimento = dataVencimento;
        this.liquidacao_cpag = liquidacao_cpag;
        this.n_doc_cpag = n_doc_cpag;
        this.historico_cpag = historico_cpag;
        this.valor_cpag = valor_cpag;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo_cont_cpag() {
        return codigo_cont_cpag;
    }

    public void setCodigo_cont_cpag(int codigo_cont_cpag) {
        this.codigo_cont_cpag = codigo_cont_cpag;
    }

    public int getCodigo_cpst_cpag() {
        return codigo_cpst_cpag;
    }

    public void setCodigo_cpst_cpag(int codigo_cpst_cpag) {
        this.codigo_cpst_cpag = codigo_cpst_cpag;
    }

    public Date getDataVencimento() {
        return dataVencimento;
    }

    public void setDataVencimento(Date dataVencimento) {
        this.dataVencimento = dataVencimento;
    }

    public Date getLiquidacao_cpag() {
        return liquidacao_cpag;
    }

    public void setLiquidacao_cpag(Date liquidacao_cpag) {
        this.liquidacao_cpag = liquidacao_cpag;
    }

    public String getN_doc_cpag() {
        return n_doc_cpag;
    }

    public void setN_doc_cpag(String n_doc_cpag) {
        this.n_doc_cpag = n_doc_cpag;
    }

    public String getHistorico_cpag() {
        return historico_cpag;
    }

    public void setHistorico_cpag(String historico_cpag) {
        this.historico_cpag = historico_cpag;
    }

    public double getValor_cpag() {
        return valor_cpag;
    }

    public void setValor_cpag(double valor_cpag) {
        this.valor_cpag = valor_cpag;
    }
}