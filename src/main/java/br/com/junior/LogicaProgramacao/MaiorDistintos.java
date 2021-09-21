package br.com.junior.LogicaProgramacao;
/*
Com três valores distintos.
Exibir o maior deles.
 */

public class MaiorDistintos {
    public static void main(String[] args) {

        int valorA = 10;
        int valorB = 8;
        int valorC = 8;


        if (valorA > valorB && valorA > valorC){
            System.out.println("Meu maior valor é: "+valorA);
        }

        else if (valorB > valorA && valorB > valorC){
            System.out.println("Meu maior valor é: "+valorB);
        }

        else if (valorA == valorB && valorA==valorC) {
            System.out.println("Valores iguais!");
        }

        else{
            System.out.println("Meu maior valor é: "+valorC);
        }

    }
}
