import java.math.BigDecimal;

import orcamento.ItemOrcamento;
import orcamento.Orcamento;
import orcamento.Orcavel;

public class TesteComposicao {
    public static void main(String[] args) {

        Orcamento antigo = new Orcamento();
        antigo.adicionarItem((Orcavel) new ItemOrcamento(new BigDecimal("200")));
        antigo.reprovar();

        Orcamento novo = new Orcamento();
        novo.adicionarItem((Orcavel) new ItemOrcamento(new BigDecimal("500")));
        novo.adicionarItem(antigo);

        System.out.println(novo.getValor());

    }
}
