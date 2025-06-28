package com.Enum;

public enum Faccoes {
    COMPILERS("Mestres das tradições, controlam a essência do código."),
    RUNNERS("Guerreiros ágeis, manipulam a velocidade e o tempo."),
    DEBUGGERS("Caçadores de falhas, enxergam além da realidade."),
    COLLECTORS("Guardiões de energia, manipulam memória e recursos."),
    ROGUES("Exilados corrompidos que buscam espalhar o caos."),
    INDEPENDENTS("Viajantes solitários que não seguem nenhuma facção."),
    ;

    private final String descricao;

    Faccoes(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
