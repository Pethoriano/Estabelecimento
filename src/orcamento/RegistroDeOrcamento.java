package orcamento;

import java.util.Map;

import Exception.DomainException;
import http.HttpAdapter;

public class RegistroDeOrcamento {

    private HttpAdapter http;

    public RegistroDeOrcamento(HttpAdapter http) {
        this.http = http;
    }

    public void registrar(Orcamento orcamento) {

        String url = "hhtp://api.exemplo.com";
        if (!orcamento.isFinalizado()) {
            throw new DomainException("Orçamento não finalizado");
        }
        Map.of(
                "valor", orcamento.getValor(),
                "quantidadeDeItens", orcamento.getQuantidadeDeItens());
        http.post(url, null);
    }

}
