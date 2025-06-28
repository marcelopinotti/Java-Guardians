package com.Personagem;
import com.Enum.Arma;
import com.Enum.Faccoes;
import com.Enum.Habilidades;
import com.Interface.EstrategiaDeBatalha;

public abstract class Personagem implements EstrategiaDeBatalha {
    protected String nome;
    protected Faccoes faccao;
    protected Arma arma;
    protected Habilidades habilidade;

    public Personagem(String nome, int i, Faccoes faccao, Arma arma, Habilidades habilidade) {
        this.nome = nome;
        this.faccao = faccao;
        this.arma = arma;
        this.habilidade = habilidade;
    }

    public String getNome() {return nome;}

    public Faccoes getFaccao() {return faccao;}

    public Arma getArma() {return arma;}

    public Habilidades getHabilidade() {return habilidade;}

    public void apresentar() {
        System.out.println("----------------------------------------");
        System.out.println("Olá, eu sou " + nome + ", da facção " +
                faccao + " a qual são " + faccao.getDescricao() + ", e minha arma é " + arma +
                ".Minha habilidade é " + habilidade + ".");
        System.out.println("----------------------------------------");}

    public abstract void habilidade(String personagem);

    @Override
    public void suporte(String aliado) {
        System.out.println(nome + " está dando suporte a " + aliado + ".");
    }
    @Override
    public void atacar(String alvo) {
        System.out.println(nome + " está atacando " + alvo + " com a " + arma + ".");
    }
}