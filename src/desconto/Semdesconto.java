package desconto;

import java.math.BigDecimal;

import orcamento.Orcamento;

public class Semdesconto extends Desconto {

    public Semdesconto(Desconto proximo) {
        super(null);
    }

    @Override
    public BigDecimal efetuarCalculo(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }

    @Override
    public boolean deveAplicar(Orcamento orcamento) {
       return true;
    }

}
