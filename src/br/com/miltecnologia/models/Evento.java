/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.miltecnologia.models;

import java.util.Date;
import java.util.List;

/**
 *
 * @author luis
 */
public class Evento {

    private String nome;
    private Date data;
    private String tipo;
    private Integer quantidadeLutas;
    private List atletas;
    private List lutas;

    public Evento(String nome, Date data, String tipo, Integer quantidadeLutas) {
        this.nome = nome;
        this.data = data;
        this.tipo = tipo;
        this.quantidadeLutas = quantidadeLutas;
    }

    public String getNome() {
        return nome;
    }

    public Integer getQuantidadeLutas() {
        return quantidadeLutas;
    }

    public List getAtletas() {
        return atletas;
    }

    public void setAtletas(List atletas) {
        this.atletas = atletas;
    }

    public List getLutas() {
        return lutas;
    }

    public void setLutas(List lutas) {
        this.lutas = lutas;
    }

    public void valido() throws Exception {
        if (atletas.isEmpty()) {
            throw new Exception("Evento sem atletas.");
        } else {
            int countPesoMaximo = 0;
            for (int i = 0; i < atletas.size(); i++) {
                Atleta a = (Atleta) atletas.get(i);
                if (a.getRanking().equals(Atleta.RANKING_MAXIMO)) {
                    countPesoMaximo++;
                }
            }
            if (countPesoMaximo > (atletas.size() / 2)) {
                throw new Exception("Quantidade de Atletas com Peso Máximo Excedido.");
            }
        }
    }

}
