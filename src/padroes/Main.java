package padroes;

import padroes.singleton.GerenciadorDeConfiguracao;
import padroes.strategy.PagamentoPix;
import padroes.strategy.PagamentoCartaoCredito;
import padroes.facade.FachadaVendas;

public class Main {
    public static void main(String[] args) {
        // Singleton
        System.out.println("=== Teste Singleton ===");
        GerenciadorDeConfiguracao config = GerenciadorDeConfiguracao.getInstancia();
        System.out.println("Loja: " + config.getNomeLoja());
        System.out.println("Moeda: " + config.getMoeda());

        System.out.println("\n=== Teste Facade com Strategy (PIX) ===");
        FachadaVendas fachada = new FachadaVendas();
        fachada.realizarPedido("Notebook Gamer", 5000.00, new PagamentoPix());

        System.out.println("\n=== Teste Facade com Strategy (Cartão) ===");
        fachada.realizarPedido("Mouse Sem Fio", 150.00, new PagamentoCartaoCredito());
    }
}
