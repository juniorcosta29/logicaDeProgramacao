package br.com.junior.LogicaProgramacao;

public class Media {
    public static void main(String[] args) {
        float media;
        float p1 = 5f;
        float p2 = 4.9f;

        media = (p1 + 2*p2)/3;

        if (media >=5){
            System.out.println("Aprovado");
        }else{
            System.out.println("Reprovado");
        }

    }
}
