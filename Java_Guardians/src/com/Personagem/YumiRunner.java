package com.Personagem;

import com.Enum.Arma;
import com.Enum.Faccoes;
import com.Enum.Habilidades;

public class YumiRunner extends Personagem {

    public YumiRunner() {
        super("Yumi", 25, Faccoes.RUNNERS, Arma.LAMINAS_PARALELAS, Habilidades.MULTITHREADING);
    }

    public void multiThreading() {
        System.out.println(getNome() + " está executando múltiplas tarefas com a " + getArma() + "!");
    }

    @Override
    public void habilidade(String personagem) {
        System.out.println(getNome() + " usa a habilidade " + getHabilidade() + "!" +
                " que permite executar múltiplas tarefas simultaneamente com as " + getArma() + "." +
                "Causando dano contra a " + personagem + ".");
    }
    public void atacar(String alvo) {
        System.out.println(getNome() + " está atacando " + alvo + " com a " + getArma() + ".");
    }


    @Override
    public String toString() {
        return "Yumi_Runner{" +
                "nome='" + getNome() + '\'' +
                ", faccao=" + getFaccao() +
                ", arma=" + getArma() +
                ", habilidade=" + getHabilidade() +
                '}';
    }

    public void corridaFantasma() {
        System.out.println(getNome() + " ativa a habilidade Corrida Fantasma, tornando-se invisível por um breve período,"
                +" permitindo que ela se mova rapidamente pelo campo de batalha e ataque seus inimigos sem ser vista.");
    }
}
