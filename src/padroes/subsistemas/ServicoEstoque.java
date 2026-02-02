package padroes.subsistemas;

public class ServicoEstoque {
    public boolean verificarEstoque(String produto) {
        System.out.println("Subsistema Estoque: Verificando disponibilidade de " + produto);
        return true; // Simula sempre disponível
    }
}
