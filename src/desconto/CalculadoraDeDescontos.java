package desconto;

import java.math.BigDecimal;

import orcamento.Orcamento;

public class CalculadoraDeDescontos {
    public BigDecimal calcular(Orcamento orcamento) {
        Desconto desconto = new OrcamentoComMaisDeCinco(
                new DescontoOrcamentoMaisQuinhetos(
                        new Semdesconto(null)));
        return desconto.calcular(orcamento);
    }
}
