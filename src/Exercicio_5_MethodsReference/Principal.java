package Exercicio_5_MethodsReference;

import domain.Jogador;

import java.util.ArrayList;
import java.util.List;

public class Principal {
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

        jogadores.forEach(joagador -> System.out.println(joagador));

        System.out.println("--------------------------------------");

//        jogadores.forEach(joagador -> joagador.tornaCampeao());

        // Aqui estou tornando todos jogadores campeões e usando outro recurso novo do java 8 o methods references
        jogadores.forEach(Jogador::tornaCampeao);
        // aqui tbm estou printando os elementos da lista usando methods references
        jogadores.forEach(System.out::println);
    }
}
