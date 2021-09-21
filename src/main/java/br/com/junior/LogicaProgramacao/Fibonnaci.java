package br.com.junior.LogicaProgramacao;
/*
Exibir os trinta primeiros valores da série de Fibonnaci
 */

public class Fibonnaci {
    public static void main(String[] args) {
    int fibonnaci =0;
    int anterior = 1;

    for (int i = 1; i < 31; i++){
        fibonnaci = fibonnaci + anterior;
        anterior = fibonnaci - anterior;
        System.out.println(fibonnaci);
    }

    }
}
