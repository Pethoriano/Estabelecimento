package desconto;

import java.math.BigDecimal;

import orcamento.Orcamento;

public class OrcamentoComMaisDeCinco extends Desconto {

    public OrcamentoComMaisDeCinco(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal calcular(Orcamento orcamento) {
        if (orcamento.getQuantidadeDeItens() > 5) {
            return orcamento.getValor().multiply(new BigDecimal("0.1"));
        }
        return proximo.calcular(orcamento);
    }
}
