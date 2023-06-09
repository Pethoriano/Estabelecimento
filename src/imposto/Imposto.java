package imposto;

import java.math.BigDecimal;

import orcamento.Orcamento;

public abstract class Imposto {

    private Imposto outro;

    public Imposto(Imposto outro) {
        this.outro = outro;
    }

    protected abstract BigDecimal realizarCalculo(Orcamento orcamento);

    public BigDecimal calcular(Orcamento orcamento) {
        BigDecimal valorImposto = realizarCalculo(orcamento);
        BigDecimal valoDoOutroImposto = BigDecimal.ZERO;
        if (outro != null) {
            valoDoOutroImposto = outro.realizarCalculo(orcamento);
        }
        return valorImposto.add(valoDoOutroImposto);
    }
}
