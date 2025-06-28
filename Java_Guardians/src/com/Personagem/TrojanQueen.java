package com.Personagem;
import com.Enum.*;

public class TrojanQueen extends Personagem {

    public TrojanQueen() {
        super("Trojan Queen", 60, Faccoes.ROGUES, Arma.FOICE_STACK_TRACE, Habilidades.EXCEPTION_STORM);
    }


    public void invocarMinions() {
        System.out.println(getNome() + " invoca seus minions-vírus para espalhar infecção pelo campo de batalha!" +
                " Eles travam as habilidades dos heróis e os enfraquecem aos poucos.");
    }


    public void ataqueContaminado(String alvo) {
        System.out.println(getNome() + " usa sua habilidade de " + getHabilidade() + " para corromper " + alvo + ", " +
                "provocando falhas constantes no código e reduzindo sua capacidade de lutar.");
    }


    public void suporteCorrompido(String aliado) {
        System.out.println(getNome() + " usa seus minions para infectar " + aliado +
                ", reduzindo sua energia e enfraquecendo suas habilidades.");
    }

    @Override
    public void habilidade(String personagem) {
        System.out.println(getNome() + " usa sua habilidade " + getHabilidade() + "!" +
                " Ela invoca minions-vírus para travar as habilidades de " + personagem +
                ", causando falhas no código e tornando-os vulneráveis.");
    }

    @Override
    public String toString() {
        return "TrojanQueen{" +
                "nome='" + getNome() + '\'' +
                ", faccao=" + getFaccao() +
                ", arma=" + getArma() +
                ", habilidade=" + getHabilidade() +
                '}';
    }
}

