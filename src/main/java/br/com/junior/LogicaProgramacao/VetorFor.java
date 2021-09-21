package br.com.junior.LogicaProgramacao;
/*
Crie um método que receba um array de dez valores inteiros.
Esse método terá que exibir:

A) O maior valor;
B) A soma dos valores;
C) A média aritmética dos valores;

O método deverá ser executado através de uma aplicação
 */

public class VetorFor {
    public static void main(String[] args) {
        int[] vetor = {2, 8, 7, 4, 5, 6, 9, 1, 11, 3};
        exibirResultados(vetor);
    }
    public static void exibirResultados(int[] vetor) {
    int maior = 0;
    int soma = 0;
    float media = 0f;

    for (int i=0; i < vetor.length; i++){
        System.out.println(vetor[i]);
    }

    }
}
