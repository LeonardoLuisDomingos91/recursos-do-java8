package Exercicio_6_Stream;

import domain.Jogador;
import domain.Time;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercicio_4_TestandoFlatMap {

    public static void main(String[] args) {

        Time barcelona = new Time("Barcelona");

        Jogador messi	=	new Jogador("Messi",	703);
        Jogador suarez	=	new Jogador("Suarez",	500);
        Jogador iniesta	=	new Jogador("iniesta",	100);
        Jogador pique	=	new Jogador("pique",	250);

        List<Jogador> jogadoresDoBarcelona = Arrays.asList(messi,suarez,iniesta,pique);

        Time real	=	new Time("Real Madrid");

        Jogador benzema	=	new Jogador("Benzema",	345);
        Jogador casemiro	=	new Jogador("Casemiro",	30);
        Jogador sergio	=	new Jogador("Sergio",	56);
        Jogador varane	=	new Jogador("Varane",	2);

        List<Jogador> jogadoresDoReal = Arrays.asList(benzema,casemiro,sergio,varane);

        Time psg	=	new Time("PSG");

        Jogador neymar	=	new Jogador("Neymar",	456);
        Jogador mbappe	=	new Jogador("Mbappe",	234);
        Jogador icardi	=	new Jogador("Icardi",	300);
        Jogador verrati	=	new Jogador("Verrati",	50);

        List<Jogador> jogadoresDoPsg = Arrays.asList(neymar,mbappe,icardi,verrati);

        List<List<Jogador>> jogadores = new ArrayList<>();

        jogadores.add(jogadoresDoBarcelona);
        jogadores.add(jogadoresDoReal);
        jogadores.add(jogadoresDoPsg);

//        List<String> groposDeJogadores = jogadores
//                .stream()
//                .flatMap()
//                .collect(Collectors.toList());


    }
}
