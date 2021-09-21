package br.com.junior.LogicaProgramacao;
/*
Através de um valor sobre tempo, onde os valores podem ser:

Ensolarado, Chovendo, Nevando, Tempestade.

Exibir as seguintes dependendo do valor.
Ensolarado: ir pra praia,
Chovendo: levar guarda chuva,
Nevando: fica em casa,
Tempestade: boa sorte.

 */

import java.lang.invoke.SwitchPoint;

public class PrevisaoTempo {
    public static void main(String[] args) {

        String tempo = ("tempestade");

        switch (tempo){

            case "ensolarado":
                System.out.println("Ir pra praia!");
                break;

            case "chovendo":
                System.out.println("Levar guarda o chuva!");
                break;

            case "nevando":
                System.out.println("Fique em casa!");
                break;

            case "tempestade":
                System.out.println("Boa Sorte!");
                break;


        }

    }
}
