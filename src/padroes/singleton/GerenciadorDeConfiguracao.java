package padroes.singleton;

public class GerenciadorDeConfiguracao {
    // A instância estática única da classe
    private static GerenciadorDeConfiguracao instancia;
    
    // Propriedades de configuração simuladas
    private String nomeLoja;
    private String moeda;

    // Construtor privado para evitar instanciação externa
    private GerenciadorDeConfiguracao() {
        // Simulação de carregamento de configurações
        this.nomeLoja = "Loja Java Patterns";
        this.moeda = "BRL";
        System.out.println("Gerenciador de Configuração inicializado (Singleton).");
    }

    // Método público para obter a instância única
    public static GerenciadorDeConfiguracao getInstancia() {
        if (instancia == null) {
            instancia = new GerenciadorDeConfiguracao();
        }
        return instancia;
    }

    // Getters e Setters para as configurações
    public String getNomeLoja() {
        return nomeLoja;
    }

    public void setNomeLoja(String nomeLoja) {
        this.nomeLoja = nomeLoja;
    }

    public String getMoeda() {
        return moeda;
    }
}
