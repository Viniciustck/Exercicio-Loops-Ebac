# Exercício: Estruturas de Repetição (Loops) e Condicionais

E uma atividade prática do curso **Java Back-end** da **EBAC (Escola Britânica de Artes Criativas e Tecnologia)**.

O objetivo é praticar o uso de Estruturas de Repetição (`for`, `while`) e como combiná-las com Estruturas Condicionais (`if`/`else`).

## Descrição da Tarefa

O programa solicita duas entradas do usuário e executa uma lógica de repetição e condição:

1.  **Entrada de Dados**:
    * Recebe o nome do usuário (texto).
    * Recebe um número inteiro positivo (N).

2.  **Lógica de Repetição (Loops)**:
    * **Contagem Crescente**: Exibe uma contagem de 0 até N (usando `for`).
    * **Contagem Decrescente**: Exibe uma contagem de N até 0 (usando `while`).

3.  **Lógica Condicional (if/else) + Loop**:
    * O programa verifica o comprimento do nome do usuário (`nome.length()`).
    * **Se** o nome tiver mais de 6 letras, o programa o exibe N vezes.
    * **Senão** (se tiver 6 letras ou menos), o programa o exibe apenas 1 vez.

## Conceitos Praticados

* **Entrada de Dados**: Uso da classe `Scanner` para ler `String` (`nextLine()`) e `int` (`Integer.parseInt(scanner.nextLine())`).
* **Estrutura de Repetição `for`**: Usada para a contagem crescente.
* **Estrutura de Repetição `while`**: Usada para a contagem decrescente.
* **Estrutura Condicional `if/else`**: Usada para tomar a decisão baseada no comprimento do nome.
* **Métodos de `String`**: Uso do método `.length()` para descobrir o número de caracteres em uma `String`.

## Como Executar

1.  Clone o repositório.
2.  Abra este projeto em uma IDE Java (como o IntelliJ IDEA).
3.  Encontre o arquivo `ContagemNome.java` (localizado em `src/`).
4.  Execute o método `main()` e interaja com o programa através do console.