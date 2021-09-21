package br.com.junior.LogicaProgramacao;

/*
Exibir a tabuada do número cinco no intervalo de um a dez.
 */

public class TabuadaCincoFor {
    public static void main(String[] args) {

        int tabuada = 5;

        for (int i = 1; i < 11; i++) {
            System.out.println(tabuada + "x" +i+ "=" + tabuada * i);

        }
    }
}
