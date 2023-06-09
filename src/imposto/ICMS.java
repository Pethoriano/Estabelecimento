package imposto;

import java.math.BigDecimal;

import orcamento.Orcamento;

public class ICMS extends Imposto {
    public ICMS(Imposto outro) {
        super(outro);
    }

    @Override
    protected BigDecimal realizarCalculo(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }

    
}
