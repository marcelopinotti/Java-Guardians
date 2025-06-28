package com.Enum;

public enum Habilidades {
    FLUXO_DO_CODIGO("pode reescrever fragmentos da realidade em plena batalha."),
    MULTITHREADING("pode criar cópias de si para atacar de vários ângulos, confundindo até o mais astuto adversário."),
    TIME_FREEZE_EXCEPTION("pode congelar tudo ao redor por um breve instante, exceto ela mesma."),
    EXCEPTION_STORM("Invoca bugs caóticos que travam as habilidades dos heróis."),
    LAMBDA_MORPH("Pode copiar e adaptar habilidades vistas em batalha.."),
    BUG_VISION("enxerga falhas e pontos fracos, podendo desestabilizar qualquer inimigo."),
    MEMORY_DRAIN("absorve energia do campo de batalha para si ou aliados."),
    DATA_SHIELD("Cria escudos protetores em volta de seus aliados."),
    CODE_HEAL("Recupera energia dos personagens."),;

    private final String habilidade;

    Habilidades(String habilidade) {
        this.habilidade = habilidade;
    }

    public String getHabilidade() {return habilidade;}


}
