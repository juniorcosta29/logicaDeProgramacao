package br.com.junior.LogicaProgramacao;

public class TabuadaQuatroFor {
    public static void main(String[] args) {

        int valor = 4;
        tabuada(valor);
    }
    /*

            for (int i = 10; i >0; i--){
                System.out.println(tabuada+"x"+i+"="+tabuada * i);

            }
        }
    */
    public static void tabuada (int valor){
        for (int i = 10; i > 0; i--) {
            System.out.println(valor + "x" + i + "=" + valor * i);


        }

    }
}

