package orcamento;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import orcamento.situacao.EmAnalise;
import orcamento.situacao.Finalizado;
import orcamento.situacao.SituacaoOrcamento;

public class Orcamento implements Orcavel{

    private BigDecimal valor = BigDecimal.ZERO;
    private SituacaoOrcamento situacao;
    private List<Orcavel> itens;

    public Orcamento() {
        this.valor = BigDecimal.ZERO;
        this.itens = new ArrayList<>();
        this.situacao = new EmAnalise();
    }

    public void aplicarDescontoExtra() {
        BigDecimal valorDoDescontoExtra = this.situacao.calcularValorDescontoExtra(this);
        this.valor = this.valor.subtract(valorDoDescontoExtra);
    }

    public void aprovar() {
        this.situacao.aprovar(this);
    }

    public void reprovar() {
        this.situacao.reprovar(this);
    }

    public void finalizar() {
        this.situacao.finalizar(this);
    }

    public BigDecimal getValor() {
        return this.valor;
    }

    public int getQuantidadeDeItens() {
        return itens.size();
    }

    public SituacaoOrcamento getSituacao() {
        return situacao;
    }

    public void setSituacao(SituacaoOrcamento situacao) {
        this.situacao = situacao;
    }

    public boolean isFinalizado() {
        return this.situacao instanceof Finalizado;
    }

    public void adicionarItem(Orcavel item){
        this.valor = this.valor.add(item.getValor());
        this.itens.add(item);
    }

}
