import java.math.BigDecimal;

import desconto.CalculadoraDeDescontos;
import orcamento.Orcamento;

public class TesteDescontos {
    public static void main(String[] args) {
        Orcamento orcamento  = new Orcamento(new BigDecimal("1000"), 4);
        CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
        System.out.println(calculadora.calcular(orcamento));
    }
}
