package imposto;

import java.math.BigDecimal;

import orcamento.Orcamento;

public class ISS extends Imposto {
    public ISS(Imposto outro) {
        super(outro);
    }

    @Override
    protected BigDecimal realizarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.06"));
    }
}