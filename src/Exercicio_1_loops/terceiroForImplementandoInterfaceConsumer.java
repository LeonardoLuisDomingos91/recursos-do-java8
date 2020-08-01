package Exercicio_1_loops;

import domain.Jogador;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class terceiroForImplementandoInterfaceConsumer {
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

        // Usando a referencia da classe criada para passar dentro do forEach
        MostraJogador mostraJogador = new MostraJogador();
        jogadores.forEach(mostraJogador);  // Usando o forEach herdado pela Interface List
    }
}
// criando uma classe para implementar a interface Consummer para poder usar no forEach
class MostraJogador implements Consumer<Jogador> {
    @Override
    public void accept(Jogador jogador) {
        System.out.println(jogador);
    }
}
