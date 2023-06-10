import java.math.BigDecimal;

import pedido.GeraPedido;
import pedido.GeraPedidoHandler;

public class TestePedidos {
    
public static void main(String[] args) {
    String cliente = "Julliane";
    BigDecimal valorOrcamento = new BigDecimal("1000");
    int quantidadeDeItens = 10;

    GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeDeItens);
    GeraPedidoHandler handler = new GeraPedidoHandler();
    handler.execute(gerador);
}

}
