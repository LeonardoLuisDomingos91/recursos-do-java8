package Exercicio_8_Optional;

import domain.Jogador;
import exception.ListaEstaVazia;

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;

public class Exercicio_1_VerificandoMediaDeGols {
    public static void main(String[] args) {

        Jogador messi	=	new Jogador("Messi",	703);
        Jogador fenomeno	=	new Jogador("Ronaldo",	500);
        Jogador zidane	=	new Jogador("Zidane",	100);
        Jogador ronaldinho	=	new Jogador("Ronaldinho",	250);
        Jogador rivaldo	=	new Jogador("Rivaldo",	350);
        Jogador kaka	=	new Jogador("Kaka",	230);
        Jogador henry	=	new Jogador("Henry",	480);
        Jogador etoo	=	new Jogador("Etoo",	360);
        Jogador suarez	=	new Jogador("Suarez",	500);
        Jogador iniesta	=	new Jogador("Iniesta",	100);
        Jogador xavi	=	new Jogador("Xavi",	70);

        List<Jogador> jogadores = new ArrayList<>();

        jogadores.add(messi);
        jogadores.add(fenomeno);
        jogadores.add(ronaldinho);
        jogadores.add(rivaldo);
        jogadores.add(kaka);
        jogadores.add(henry);
        jogadores.add(etoo);
        jogadores.add(suarez);
        jogadores.add(iniesta);
        jogadores.add(xavi);

        double somaGols = 0.0;

        for (Jogador jogador: jogadores){
            somaGols += jogador.getGols();
        }

        double mediaDeGols;

        if (jogadores.isEmpty()){
            mediaDeGols = 0.0;
        }else{
            mediaDeGols = somaGols / jogadores.size();
        }

       System.out.println(mediaDeGols);

        Double media = jogadores
                .stream()
                .mapToInt(Jogador::getGols)
                .average()
                .orElseThrow(() -> new ListaEstaVazia("Lista esta vazia"));

      //  Double mediaGols = media.orElse(0.0);

       // System.out.println(media);
    }
}
