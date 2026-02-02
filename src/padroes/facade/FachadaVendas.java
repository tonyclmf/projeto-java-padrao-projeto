package padroes.facade;

import padroes.strategy.EstrategiaPagamento;
import padroes.subsistemas.ServicoEntrega;
import padroes.subsistemas.ServicoEstoque;

public class FachadaVendas {
    private ServicoEstoque estoque;
    private ServicoEntrega entrega;

    public FachadaVendas() {
        this.estoque = new ServicoEstoque();
        this.entrega = new ServicoEntrega();
    }

    public void realizarPedido(String produto, double valor, EstrategiaPagamento estrategiaPagamento) {
        System.out.println("--- Iniciando Pedido via Facade ---");
        if (estoque.verificarEstoque(produto)) {
            estrategiaPagamento.pagar(valor);
            entrega.agendarEntrega(produto);
            System.out.println("--- Pedido Concluído ---");
        } else {
            System.out.println("Falha: Produto fora de estoque.");
        }
    }
}
