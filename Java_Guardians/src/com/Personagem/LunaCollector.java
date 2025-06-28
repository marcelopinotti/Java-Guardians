package com.Personagem;
import com.Enum.*;

public class LunaCollector extends Personagem{
    public LunaCollector() {
        super("Luna Collector",40, Faccoes.COLLECTORS, Arma.CAJADO_GARBAGE, Habilidades.MEMORY_DRAIN);
    }

    @Override
    public void habilidade(String personagem) {
        System.out.println(getNome() + " usa sua habilidade " + getHabilidade() + "!" +
                " Com seu " + getArma() + ", ela absorve a energia ao redor, drenando a força de " + personagem + " e " +
                "restaurando suas próprias forças ou as de seus aliados!");
    }
    @Override
    public void atacar(String alvo) {
        System.out.println(getNome() + " usa seu " + getArma() + " para manipular o fluxo de memória, causando dano indireto a "
                + alvo + " ao drenar sua energia!");
    }


    @Override
    public void suporte(String aliado) {

        System.out.println(getNome() + " usa " + getHabilidade() + " para drenar a energia do campo de batalha e restaurar as forças de "
                + aliado + " com seu " + getArma() + "!");
    }

    public void controleDeMemoria() {
        System.out.println(getNome() + " usa seu " + getArma() + " para manipular fluxos de memória, " +
                "fazendo o campo de batalha se adaptar conforme sua vontade, controlando a energia que circula ao seu redor.");
    }


    public void memoriaPerfeita() {
        System.out.println(getNome() + " possui uma memória perfeita, capaz de se lembrar de cada batalha e estratégia, " +
                "o que a torna uma guerreira incomparável. Ela utiliza esse poder para salvar seus aliados nas horas mais difíceis.");
    }


    public void tensaoComYumi() {
        System.out.println(getNome() + " tem uma paixão secreta por Yumi, e essa relação cria tensões e alianças inesperadas " +
                "entre as facções, pois seu amor é visto com ceticismo pelas outras facções.");
    }


    @Override
    public void apresentar() {
        System.out.println("Eu sou " + getNome() + ", da facção " + getFaccao() + ". Minha arma é " + getArma() + " e minha habilidade é " + getHabilidade() + ".");
    }

    public void salvarAya() {
        System.out.println(getNome() + " invoca sua habilidade de drenagem de memória, " +
                "absorvendo a energia perdida no campo de batalha e transferindo-a para Aya, " +
                "restaurando suas forças e dando-lhe uma nova chance de lutar, como uma verdadeira guerreira.");
    }


    public void coletaTotal() {
        System.out.println(getNome() + " ativa a Coleta Total, drenando toda a energia do campo de batalha " +
                "e canalizando-a para si mesma e para seus aliados, " +
                "transformando-se em uma força imparável, capaz de virar o jogo no último segundo.");
    }

}
