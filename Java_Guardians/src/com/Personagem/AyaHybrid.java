package com.Personagem;
import com.Enum.*;

public class AyaHybrid extends Personagem {

    public AyaHybrid() {
        super("Aya", 28, Faccoes.COMPILERS, Arma.KATANA_DE_DADOS, Habilidades.MULTITHREADING);
    }

    @Override
    public void habilidade(String personagem) {
        System.out.println(nome + " usa a habilidade " + habilidade + "!" +
                " Com a " + arma + ", " + nome + " divide sua mente e executa múltiplas tarefas simultâneas, " +
                "atacando " + personagem + " de ângulos inesperados, causando dano devastador!");
    }

    public void fluxoDeCodigo() {
        System.out.println(nome + " invoca o " + habilidade + ", manipulando o fluxo do código com sua " + arma + ", " +
                "reescrevendo a realidade e distorcendo as leis do universo ao seu redor!");
    }

    public void multiThreading() {
        System.out.println(nome + " ativa " + habilidade + " e cria cópias etéreas de si mesma, " +
                "atacando " + arma + " de maneira imprevisível e devastadora, confundindo até os mais fortes adversários!");
    }

    public void suporte(String aliado) {
        System.out.println(nome + " usa sua inteligência e habilidade para fornecer suporte a " + aliado + ", " +
                "manipulando o código ao redor deles e criando escudos de proteção com sua " + arma + ".");
    }

    @Override
    public String toString() {
        return "Aya_Hybrid{" +
                "nome='" + nome + '\'' +
                ", faccao=" + faccao +
                ", arma=" + arma +
                ", habilidade=" + habilidade +
                '}';
    }

    public void refatoracaoSuprema() {
        System.out.println(nome + " executa a Refatoração Suprema, " +
                "otimizando o código de batalha com sua " + arma + ", " +
                "transformando cada movimento em uma obra-prima de eficiência e poder!");
    }
}

