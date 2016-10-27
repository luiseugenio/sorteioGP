/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.miltecnologia.service;

import br.com.miltecnologia.models.Atleta;
import br.com.miltecnologia.models.Luta;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 *
 * @author luis
 */
public class Sorteio {

    public static List sortear(List<Atleta> atletas, Integer quantidadeDeLutas) {
        List<Luta> lutas = new ArrayList<>();
        Collections.shuffle(atletas);

        for (int i = 0; i < quantidadeDeLutas; i++) {
            Atleta azul = getAtletaAzul(atletas);
            Atleta vermelho = getAtletaVermelho(atletas, azul);
            Luta luta = new Luta(azul, vermelho);
            while (!luta.valida()) {
                vermelho = getAtletaVermelho(atletas, azul);
                luta = new Luta(azul, vermelho);
            }
            atletas.remove(azul);
            atletas.remove(vermelho);
            lutas.add(luta);
        }
        return lutas;
    }

    private static Atleta getAtletaAzul(List<Atleta> atletas) {
        int indice = new Random().nextInt(atletas.size());
        while (indice == atletas.size()) {
            indice = new Random().nextInt(atletas.size());
        }
        return atletas.get(indice);
    }

    private static Atleta getAtletaVermelho(List<Atleta> atletas, Atleta adversario) {
        int indice = new Random().nextInt(atletas.size());
        while (indice == atletas.size() || atletas.get(indice).equals(adversario)) {
            indice = new Random().nextInt(atletas.size());
        }
        return atletas.get(indice);
    }

}
