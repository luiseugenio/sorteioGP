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

    private String equipe;
    private String nome;
    private Integer ranking;

    public Atleta(String nome, String equipe, Integer peso) {
        this.nome = nome;
        this.equipe = equipe;
        this.ranking = peso;
    }

    public String getEquipe() {
        return equipe;
    }

    public String getNome() {
        return nome;
    }

    public Integer getRanking() {
        return ranking;
    }

    @Override
    public String toString() {
        return nome + "(" + equipe + ") - " + ranking;
    }

    @Override
    public boolean equals(Object obj) {
        return (this.nome.equalsIgnoreCase(((Atleta) obj).getNome()) && this.equipe.equalsIgnoreCase(((Atleta) obj).getEquipe()));
    }

}
