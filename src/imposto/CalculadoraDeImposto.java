package imposto;

import java.math.BigDecimal;

import orcamento.Orcamento;

public class CalculadoraDeImposto {
    
    public BigDecimal calcular(Orcamento orcamento, Imposto imposto){
        return imposto.calcular(orcamento);
    }
}
