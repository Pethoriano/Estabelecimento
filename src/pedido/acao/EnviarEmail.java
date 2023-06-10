package pedido.acao;

import pedido.Pedido;

public class EnviarEmail implements AcaoAposGerarPedido {

    @Override
    public void executarAcao(Pedido pedido) {
        System.out.println("Enviando email");
    }

}
