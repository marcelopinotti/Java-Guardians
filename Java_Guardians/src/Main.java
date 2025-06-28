import com.Personagem.*;

public class Main {
    public static void main(String[] args) {

        HiroCompiler hiro = new HiroCompiler();
        YumiRunner yumi = new YumiRunner();
        AyaHybrid aya = new AyaHybrid();
        SenseiBugEye sensei = new SenseiBugEye();
        LunaCollector luna = new LunaCollector();
        TaroStackOverFlow taro = new TaroStackOverFlow();
        TrojanQueen trojanQueen = new TrojanQueen();


        hiro.apresentar();
        yumi.apresentar();
        aya.apresentar();
        sensei.apresentar();
        luna.apresentar();
        taro.apresentar();
        trojanQueen.apresentar();

        // Ato 1 - A Chegada da Ameaça
        System.out.println("\nTudo começa quando...");
        taro.exceptionStorm();
        trojanQueen.invocarMinions();
        taro.encontrarCodice();
        luna.salvarAya();
        sensei.treinarAya();
        sensei.ensinar();

        // Ato 2 - A Jornada dos Heróis
        System.out.println("\nHiro e Yumi uniram suas forças, desafiando as leis das facções. Juntos, eles criaram Aya, " +
                "um símbolo de que forças opostas podem se unir para algo maior!");


        hiro.fluxoDeCodigo();
        yumi.multiThreading();
        luna.controleDeMemoria();
        luna.tensaoComYumi();
        luna.salvarAya();

        // Ato 3 - O Confronto Final
        System.out.println("\nO confronto final contra Taro e a Trojan Queen começa!");


        hiro.fluxoDeCodigo();
        yumi.corridaFantasma();
        aya.refatoracaoSuprema();
        sensei.enxergarFalhas();
        sensei.debugFatal("Taro");
        luna.coletaTotal();
        trojanQueen.ataqueContaminado("Aya");
        trojanQueen.suporteCorrompido("Luna");
        hiro.atacar("Taro");
        yumi.atacar("Taro");
        aya.atacar("Taro");
        luna.atacar("Taro");
        luna.atacar("Taro");
        trojanQueen.atacar("Hiro");

        // Ato 4 - A Vitória dos Heróis
        System.out.println("\nCom a união de suas forças, os heróis derrotam Taro e a Trojan Queen, restaurando a ordem no universo Java!");

        System.out.println("\nAya agora lidera as facções, mantendo o equilíbrio e prevenindo novas ameaças!");

        luna.memoriaPerfeita();
        aya.multiThreading();
        aya.fluxoDeCodigo();
        yumi.multiThreading();
    }
}
