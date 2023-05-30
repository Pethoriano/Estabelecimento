package desconto;
import java.math.BigDecimal;
import orcamento.Orcamento;


public class DescontoOrcamentoMaior500 extends Desconto{
    
    public DescontoOrcamentoMaior500(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal efetuarCalculo (Orcamento orcamento){
            return orcamento.getValor().multiply(new BigDecimal("0.05"));
    }
        @Override
    public boolean deveAplicar(Orcamento orcamento) {
        return (orcamento.getValor().compareTo(new BigDecimal("500"))>0);
    }
}
