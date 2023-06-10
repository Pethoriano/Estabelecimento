package orcamento.situacao;

import java.math.BigDecimal;

import Exception.DomainException;
import orcamento.Orcamento;

public abstract class SituacaoOrcamento {

    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }

    public void aprovar(Orcamento orcamento) {
        throw new DomainException("Não pode ser aprovado");
    }

    public void reprovar(Orcamento orcamento) {
        throw new DomainException("Não pode ser reprovado");
    }

    public void finalizar(Orcamento orcamento) {
        throw new DomainException("Não pode ser finalizado");
    }

}
