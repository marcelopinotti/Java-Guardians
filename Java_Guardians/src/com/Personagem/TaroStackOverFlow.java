package com.Personagem;
import com.Enum.*;
public class TaroStackOverFlow extends Personagem {
        private boolean temCodice = false;

        public TaroStackOverFlow() {
            super("Taro StackOverflow", 40, Faccoes.ROGUES, Arma.FOICE_STACK_TRACE, Habilidades.EXCEPTION_STORM);
        }


        public void encontrarCodice() {
            temCodice = true;
            System.out.println(getNome() + " encontrou o Códice Proibido! Com ele, ele pode destruir as facções e reescrever a realidade!");
        }


        public void exceptionStorm() {
            System.out.println(getNome() + " invoca sua habilidade " + getHabilidade() + "!" +
                    " Ele cria um caos no campo de batalha, invocando bugs caóticos que travam as habilidades dos heróis!");
        }

        @Override
        public void habilidade(String personagem) {
            System.out.println(getNome() + " usa a habilidade " + getHabilidade() + "!" +
                    " Invocando bugs caóticos, ele trava as habilidades de " + personagem + ", deixando-o indefeso!");
        }

        @Override
        public String toString() {
            return "Taro{" +
                    "nome='" + getNome() + '\'' +
                    ", faccao=" + getFaccao() +
                    ", arma=" + getArma() +
                    ", habilidade=" + getHabilidade() +
                    ", temCodice=" + temCodice +
                    '}';
        }
    }

