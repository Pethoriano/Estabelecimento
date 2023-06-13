import java.math.BigDecimal;

import desconto.CalculadoraDeDescontos;
import orcamento.ItemOrcamento;
import orcamento.Orcamento;
import orcamento.Orcavel;

public class TesteDescontos {
    public static void main(String[] args) {
        Orcamento primeiro = new Orcamento();
        primeiro.adicionarItem((Orcavel) new ItemOrcamento(new BigDecimal("200")));
        Orcamento segundo = new Orcamento();
        segundo.adicionarItem((Orcavel) new ItemOrcamento(new BigDecimal("1000")));
        Orcamento terceiro = new Orcamento();
        terceiro.adicionarItem((Orcavel) new ItemOrcamento(new BigDecimal("500")));

        CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
        System.out.println(calculadora.calcular(primeiro));
        System.out.println(calculadora.calcular(segundo));
        System.out.println(calculadora.calcular(terceiro));
    }
}
