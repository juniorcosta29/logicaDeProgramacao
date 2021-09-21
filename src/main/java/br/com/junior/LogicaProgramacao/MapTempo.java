package br.com.junior.LogicaProgramacao;

import java.util.LinkedHashMap;

public class MapTempo {
    public static void main(String[] args) {

        LinkedHashMap<String, String> mapTempo = new LinkedHashMap<>();
        mapTempo.put("ensolarado", "ir pra praia!");
        mapTempo.put("chovendo", "Levar guarda chuva!");
        mapTempo.put("nevando", "Fique em casa!");
        mapTempo.put("tempestade", "Boa sorte!");

        System.out.println(mapTempo.get("nevando"));

    }
}

