package br.com.junior.LogicaProgramacao;
/*
Calcular e exibir a tensão de um determinado circuito eletrônico a partir dos valores da resistência e corrente elétrica.
Dica: Fórmula de Ohm, R=U*I
*/

public class LeiDeOhm {
    public static void main(String[] args) {

        int tensao;
        int resistencia = 10;
        int corrente = 10;

        tensao = resistencia * corrente;

        System.out.println(tensao +" Vts");


    }
}
