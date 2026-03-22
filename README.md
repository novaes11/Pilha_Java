# Estruturas de Dados: Pilhas em Java

Este projeto contém a implementação de duas estruturas de dados do tipo **Pilha (Stack)** em Java. O objetivo é demonstrar e comparar a diferença entre uma implementação estática (usando Arrays) e uma dinâmica (usando Nós/Referências).

## 📚 O que é uma Pilha?
Uma pilha é uma estrutura de dados que segue o princípio **LIFO** (*Last In, First Out* - O último a entrar é o primeiro a sair). Imagine uma pilha de pratos: você sempre coloca um prato novo no topo e, quando precisa de um, tira o que está no topo.

## 🛠️ Estruturas Implementadas

### 1. PilhaDinamica (Pilha com Nós)
- **Como funciona:** Utiliza a classe `No` para encadear os elementos na memória.
- **Vantagem:** Cresce dinamicamente. Não há limite de tamanho (apenas a memória do computador).
- **Desvantagem:** Ocupa um pouco mais de memória pois cada elemento precisa guardar a referência do próximo.

### 2. PilhaSimples (Pilha Estática com Array)
- **Como funciona:** Utiliza um vetor (`String[]`) e uma variável `topo` (índice) para controlar a entrada e saída de dados.
- **Vantagem:** Muito rápida e leve, pois os dados ficam em posições sequenciais de memória.
- **Desvantagem:** Tamanho fixo. Se a pilha encher, não é possível adicionar novos elementos sem criar um array maior.

## 🚀 Como executar

1. Certifique-se de ter o [Java JDK](https://www.oracle.com/java/technologies/downloads/) instalado na sua máquina.
2. Mantenha os arquivos no mesmo diretório/pacote (`Pilha`).
3. Compile e execute a classe principal `Listas.java`.

```bash
javac Pilha/*.java
java Pilha.Listas
