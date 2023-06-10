package pedido.acao;

import pedido.Pedido;

public class SalvarNoBD implements AcaoAposGerarPedido {

    @Override
    public void executarAcao(Pedido pedido) {
        System.out.println("Salvando pedido no BD");
    }

}
