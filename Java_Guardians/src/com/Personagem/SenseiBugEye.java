package com.Personagem;
import com.Enum.*;

public class SenseiBugEye extends Personagem {

    public SenseiBugEye() {
        super("Sensei BugEye", 50, Faccoes.DEBUGGERS, Arma.LUPA_ESPECTRAL, Habilidades.BUG_VISION);
    }

    @Override
    public void habilidade(String personagem) {
        System.out.println(getNome() + " usa sua habilidade " + getHabilidade() + "!" +
                " Com sua " + getArma() + ", " + getNome() + " revela as falhas e pontos fracos de " + personagem + ", " +
                "desestabilizando completamente seu inimigo e deixando-o vulnerável a ataques críticos!");
    }

    public void enxergarFalhas() {
        System.out.println(getNome() + " usa a " + getHabilidade() + " para enxergar falhas no código do universo, " +
                "conseguindo localizar pontos fracos que podem ser explorados para desmantelar até o mais poderoso dos inimigos.");
    }

    public void ensinar() {
        System.out.println(getNome() + " compartilha sua sabedoria com os jovens guerreiros, " +
                "alertando-os sobre os perigos do 'Código Maligno' e mostrando o caminho para evitar a corrupção que quase destruiu o universo Java.");
    }

    public void treinarAya() {
        System.out.println(getNome() + " percebe que Aya pode ser a chave para impedir uma nova guerra e passa a treiná-la secretamente," +
                " compartilhando todo seu conhecimento sobre o 'Código Maligno'.");
    }

    @Override
    public String toString() {
        return "Sensei_BugEye{" +
                "nome='" + getNome() + '\'' +
                ", faccao=" + getFaccao() +
                ", arma=" + getArma() +
                ", habilidade=" + getHabilidade() +
                '}';
    }

    public void debugFatal(String taro) {
        System.out.println(getNome() + " usa sua habilidade " + getHabilidade() + " para lançar um ataque fatal em "
                + taro + ",desencadeando uma série de falhas críticas que desmantelam completamente o código de defesa do inimigo," +
                "deixando-o vulnerável e sem chances de recuperação!");
    }
}
