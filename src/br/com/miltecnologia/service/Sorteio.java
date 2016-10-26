/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.miltecnologia.service;

import br.com.miltecnologia.models.Atleta;
import br.com.miltecnologia.models.Evento;
import br.com.miltecnologia.models.Luta;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author luis
 */
public class Sorteio {

    public static Evento sortear(Evento evento) {
        List<Luta> lutas = new ArrayList<>();
        List<Atleta> atletas = evento.getAtletas();
        Collections.shuffle(atletas);

        for (int i = 0; i < evento.getQuantidadeLutas(); i++) {
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

            System.out.println(luta);

        }
        evento.setLutas(lutas);
        return evento;
    }

    private static Atleta getAtletaAzul(List<Atleta> atletas) {
        int indice = (int) (Math.random() * atletas.size());
        while (indice == atletas.size()) {
            indice = (int) (Math.random() * atletas.size());
        }
        return atletas.get(indice);
    }

    private static Atleta getAtletaVermelho(List<Atleta> atletas, Atleta adversario) {
        int indice = (int) (Math.random() * (atletas.size() - 1));
        while (indice == atletas.size() || atletas.get(indice).equals(adversario)) {
            indice = (int) (Math.random() * (atletas.size() - 1));
        }
        return atletas.get(indice);
    }

//    public static void main(String[] args) {
//        Evento evento = new Evento("Coronel Combate", new Date(System.currentTimeMillis()), "GP", 2);
//        List<Atleta> atletas = new ArrayList<>();
//        Atleta iamik = new Atleta("Iamik", "Dragon", Atleta.RANKING_MAXIMO);
//        atletas.add(iamik);
//        Atleta helio = new Atleta("Helio", "V8", Atleta.RANKING_MAXIMO);
//        atletas.add(helio);
//        Atleta fernando = new Atleta("Fernando", "MTB", Atleta.RANKING_MEDIO);
//        atletas.add(fernando);
//        Atleta anderson = new Atleta("Anderson", "RKR", Atleta.RANKING_MEDIO);
//        atletas.add(anderson);
//        Atleta berg = new Atleta("Berg", "Barra", Atleta.RANKING_MEDIO);
//        atletas.add(berg);
//        Atleta gugu = new Atleta("Gugu", "Gladiadores", Atleta.RANKING_MINIMO);
//        atletas.add(gugu);
//        Atleta neto = new Atleta("Neto", "Black", Atleta.RANKING_MAXIMO);
//        atletas.add(neto);
//        Atleta andersonSilva = new Atleta("Anderson Silva", "Ferreira", Atleta.RANKING_MEDIO);
//        atletas.add(andersonSilva);
//        evento.setAtletas(atletas);
//        try {
//            evento.valido();
//            sortear(evento);
//        } catch (Exception e) {
//            System.err.println(e.getMessage());
//        }
//    }
}
