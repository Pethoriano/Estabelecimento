package desconto;

import java.math.BigDecimal;

import orcamento.Orcamento;

public class Semdesconto extends Desconto {

    public Semdesconto(Desconto proximo) {
        super(null);
    }

    @Override
    public BigDecimal calcular(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }

}
