package Pilha;

public class PilhaDinamica {
    private No inicio;




    public boolean estaVazia(){
        return this.inicio == null;
    }

    public String consultarInicio(){
        if(estaVazia()){
            System.out.println("Pilha vazia!");
            return null;
        }
        return inicio.conteudo;
    }
}
