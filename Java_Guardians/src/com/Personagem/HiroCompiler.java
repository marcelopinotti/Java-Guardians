package com.Personagem;


import com.Enum.Arma;
import com.Enum.Faccoes;
import com.Enum.Habilidades;

public class HiroCompiler extends Personagem {

    public HiroCompiler() {
        super("Hiro", 30, Faccoes.COMPILERS, Arma.KATANA_DE_DADOS, Habilidades.FLUXO_DO_CODIGO);
    }


    public void fluxoDeCodigo() {
        System.out.println(nome + " ativa o " + getHabilidade() + " com sua " + getArma() + ", " +
                "manipulando o código com maestria para reescrever a realidade ao seu redor, " +
                "alterando a batalha com um simples movimento de sua lâmina!");
    }

    public void evolucaoComYumi() {
        System.out.println(getNome() + " e Yumi uniram suas forças, desafiando as leis das facções. Juntos, eles criaram Aya, " +
                "um símbolo de que forças opostas podem se unir para algo maior!");
    }

    @Override
    public void habilidade(String personagem) {
        System.out.println(getNome() + " invoca sua habilidade " + getHabilidade() + "!" +
                " Usando sua " + getArma() + ", " + getNome() + " altera o fluxo do código com precisão, " +
                "enfraquecendo " + personagem + " com ataques devastadores e reescrevendo seu destino!");
    }

    public void atacar(String alvo) {
        System.out.println(getNome() + " avança com a " + getArma() + " e ataca " + alvo + ", " +
                "cortando linhas de código e alterando a lógica da batalha ao seu favor!");
    }

    @Override
    public String toString() {
        return "Hiro_Compiler{" +
                "nome='" + getNome() + '\'' +
                ", faccao=" + getFaccao() +
                ", arma=" + getArma() +
                ", habilidade=" + getHabilidade() +
                '}';
    }

    public void buildFinal() {
        System.out.println(getNome() + " está finalizando o build do código com maestria, " +
                "preparando-se para a batalha final com sua " + getArma() + ", " +
                "onde cada linha de código será crucial para a vitória!");
    }
}

