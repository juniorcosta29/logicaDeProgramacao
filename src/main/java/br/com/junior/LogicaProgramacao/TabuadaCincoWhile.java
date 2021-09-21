package br.com.junior.LogicaProgramacao;

/*
Exibir a tabuada do número cinco no intervalo de um a dez.
 */

public class TabuadaCincoWhile {
    public static void main(String[] args) {
        int tabuada = 5;
        int cont =1;

        while (cont < 11){
            System.out.println(tabuada+"x"+cont+"="+tabuada*cont);
            cont++; //Ou cont = cont + 1;

        }

    }
}

