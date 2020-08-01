package Exercicio_2_loops;

import domain.Jogador;

import java.util.ArrayList;
import java.util.List;

public class PrimeiroLambda {
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

        // aqui estou tornando todos jogadores campeões todos vão ficar true foi o que pensei para mpstrar que o forEach não serve só para printar od dados de um objeto
        jogadores.forEach(joagador -> joagador.tornaCampeao());

        // aqui usamos uma expressão lambda é um recurso do java 8 com esse recurso não precisamos mais criar classes anonimas ja fazemos direto
        jogadores.forEach(joagador -> System.out.println(joagador));

    }
}
