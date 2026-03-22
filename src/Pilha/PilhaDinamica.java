package Pilha;

public class PilhaDinamica {
    private No inicio;

    public PilhaDinamica() {
        this.inicio = null;
    }

    // Forma a qual Pilhas funcionam: First in - Last out
    public void empilhar(String conteudo){
        No aux = new No(conteudo);
        aux.setProximo(this.inicio);
        this.inicio = aux;
    }

    // Forma a qual Pilhas funcionam: First in - Last out
    public void desempilhar(){

    }


    public boolean estaVazia(){
        return this.inicio == null;
    }

    public String consultarInicio(){
        if(estaVazia()){
            System.out.println("Pilha vazia!");
            return null;
        }
        return inicio.getConteudo();
    }

    public void exibir(){
        if(estaVazia()){
            System.out.println("Pilha está vazia!");
            return;
        }
        No atual = inicio;
        while(atual != null){
            System.out.println(atual.getConteudo());
            atual = atual.getProximo();
        }
    }
}
