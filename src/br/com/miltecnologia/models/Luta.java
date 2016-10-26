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
public class Luta {

    private Atleta azul;
    private Atleta vermelho;
    private Double categoria;

    public Luta(Atleta azul, Atleta vermelho) {
        this.azul = azul;
        this.vermelho = vermelho;
    }

    public Atleta getAzul() {
        return azul;
    }

    public Atleta getVermelho() {
        return vermelho;
    }

    public void setCategoria(Double categoria) {
        this.categoria = categoria;
    }

    public boolean valida() {
        return !((azul.getRanking() == Atleta.RANKING_MAXIMO && vermelho.getRanking() == Atleta.RANKING_MAXIMO)
                || azul.equals(vermelho));
    }

    @Override
    public String toString() {
        String luta = azul + " X " + vermelho;
        if (categoria != null) {
            luta += " (" + categoria + ")";
        }
        return luta;
    }

}
