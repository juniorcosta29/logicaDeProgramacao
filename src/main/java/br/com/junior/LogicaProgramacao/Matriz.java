package br.com.junior.LogicaProgramacao;
/*
Criar um programa, que tenha três nomes e três sexo correspondente.
Exibir o nome e sexo de cada item da matriz.

 */

public class Matriz {
    public static void main(String[] args) {

        String[][] matriz = {{"Mateus", "Maria", "Pedro"},
                {"Masculino", "Feminino", "Masculino"},{"17", "22", "28"}};


        for (int i =0; i < matriz[0].length; i++){
            System.out.println("Nome:" +matriz[0][i]);
            System.out.println("Sexo:"+matriz[1][i]);
            System.out.println("Idade:" +matriz[2][i]);
        }
    }
}