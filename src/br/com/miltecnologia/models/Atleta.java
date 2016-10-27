/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.miltecnologia.models;

/**
 *
 * @author luis
 */
public class Atleta {

    public static final int RANKING_MAXIMO = 100;
    public static final int RANKING_MEDIO = 50;
    public static final int RANKING_MINIMO = 10;

    private final String nome;
    private final String equipe;
    private Integer ranking;

    public Atleta(String nome, String equipe) {
        this.nome = nome;
        this.equipe = equipe;
    }

    public Atleta(String nome, String equipe, Integer ranking) {
        this.nome = nome;
        this.equipe = equipe;
        this.ranking = ranking;
    }

    public String getEquipe() {
        return equipe;
    }

    public String getNome() {
        return nome;
    }

    public Integer getRanking() {
        if (ranking == null) {
            ranking = RANKING_MINIMO;
        }
        return ranking;
    }

    @Override
    public String toString() {
        return nome + " (" + equipe + ")";
    }

    @Override
    public boolean equals(Object obj) {
        return (this.nome.equalsIgnoreCase(((Atleta) obj).getNome()) && this.equipe.equalsIgnoreCase(((Atleta) obj).getEquipe()));
    }

}
