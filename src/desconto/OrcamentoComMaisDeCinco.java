package desconto;

import java.math.BigDecimal;

import orcamento.Orcamento;

public class OrcamentoComMaisDeCinco extends Desconto {

    public OrcamentoComMaisDeCinco(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal efetuarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }

    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        return (orcamento.getQuantidadeDeItens() > 5);
    }
}
