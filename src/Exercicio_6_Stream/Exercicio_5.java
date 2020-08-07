package Exercicio_6_Stream;

import domain.Jogador;
import domain.Time;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Exercicio_5 {

    public static void main(String[] args) {

        Jogador neymar = new Jogador("Neymar", 367);
        Time barcelona = new Time("Barcelona");
        Time santos	=	new Time("Santos");
        Time psg	=	new Time("PSG");

        neymar.setTimeAnteriores(Arrays.asList(barcelona,santos,psg));

        Jogador cr7 = new Jogador("Cristiano Ronaldo", 756);
        Time sport = new Time("Sport");
        Time united	=	new Time("United");
        Time real	=	new Time("Real");
        Time juve	=	new Time("Juve");

        cr7.setTimeAnteriores(Arrays.asList(sport,united,real,juve));

        List<Jogador> grupoDeTimes = Arrays.asList(neymar,cr7);

        List<Time> todosOsTimes = grupoDeTimes
                .stream()
                .flatMap(grupo -> grupo.getTimeAnteriores()
                        .stream())
                .collect(Collectors.toList());

        todosOsTimes.forEach(System.out::println);
    }
}
