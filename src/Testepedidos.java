import java.math.BigDecimal;
import java.util.Arrays;
import pedido.GeraPedido;
import pedido.GeraPedidoHandler;
import pedido.acao.EnviarEmail;
import pedido.acao.SalvarNoBD;

public class TestePedidos {

    public static void main(String[] args) {
        String cliente = "Julliane";
        BigDecimal valorOrcamento = new BigDecimal("1000");
        int quantidadeDeItens = 10;

        GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeDeItens);
        GeraPedidoHandler handler = new GeraPedidoHandler(Arrays.asList(
                new SalvarNoBD(),
                new EnviarEmail()));
        handler.execute(gerador);
    }

}
