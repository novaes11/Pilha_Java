import Pilha.PilhaDinamica;
import Pilha.PilhaSimples;

public class Pilhas {
    public static void main(String[] args) {

        System.out.println("--- Testando Pilha Dinâmica ---");
        PilhaDinamica pd = new PilhaDinamica();

        pd.empilhar("Prato 1");
        pd.empilhar("Prato 2");
        pd.empilhar("Prato 3");
        pd.exibir();

        System.out.println("Removido: " + pd.desempilhar());
        pd.exibir();

        System.out.println("\n--- Testando Pilha Simples ---");
        PilhaSimples ps = new PilhaSimples(3); // Limite de 3 itens

        ps.empilhar("Livro A");
        ps.empilhar("Livro B");
        ps.empilhar("Livro C");
        ps.exibir();

        System.out.println("\nTentando empilhar mais um:");
        ps.empilhar("Livro D"); // Aqui deve disparar o aviso de pilha cheia

        System.out.println("\nRemovido: " + ps.desempilhar());
        ps.exibir();
    }
}
