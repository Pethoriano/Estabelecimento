import java.math.BigDecimal;

import imposto.CalculadoraDeImposto;
import imposto.ISS;
import orcamento.ItemOrcamento;
import orcamento.Orcamento;

public class TesteImpostos {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento();
        orcamento.adicionarItem(new ItemOrcamento(new BigDecimal("100")));
        
        CalculadoraDeImposto calculadora = new CalculadoraDeImposto();
        System.out.println(calculadora.calcular(orcamento, new ISS(null)));
    }
}
