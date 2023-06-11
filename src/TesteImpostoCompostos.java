import java.math.BigDecimal;

import imposto.CalculadoraDeImposto;
import imposto.ICMS;
import imposto.ISS;
import orcamento.Orcamento;

public class TesteImpostoCompostos {
    
public static void main(String[] args) {
    Orcamento orcamento = new Orcamento(new BigDecimal("100"), 1);
    CalculadoraDeImposto calculadora = new CalculadoraDeImposto();

    System.out.println(calculadora.calcular(orcamento, new ISS(new ICMS(null))));

}

}
