package padroes.strategy;

public class PagamentoCartaoCredito implements EstrategiaPagamento {
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de R$ " + valor + " realizado via Cartão de Crédito.");
    }
}
