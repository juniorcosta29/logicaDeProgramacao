package br.com.junior.LogicaProgramacao;

public class VetorForEach {
    public static void main(String[] args) {
        int[] vetor = {2, 8, 7, 4, 5, 6, 9, 1, 11, 3};
        exibirResultados(vetor);
    }

    public static void exibirResultados(int[] vetor) {
        int maior = 0;
        int soma = 0;
        float media = 0f;

        for (int valor : vetor) {
            if (valor > maior) {
                maior = valor;
            }

            soma = soma + valor; //Ou soma += valor;
        }
        media = soma / (float) vetor.length;


        System.out.println("O maior valor é: " + maior);
        System.out.println("A soma dos valores é: " + soma);
        System.out.println("A media é: " + media);

    }
    }


