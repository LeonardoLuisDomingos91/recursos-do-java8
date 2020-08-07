package domain;

import java.util.ArrayList;
import java.util.List;

public class Jogador {

    private String nome;
    private Integer gols;
    private Boolean mundial;

    private List<Time> timeAnteriores;

    public Jogador(String nome, Integer gols) {
        this.nome = nome;
        this.gols = gols;
        this.mundial = false;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getGols() {
        return gols;
    }

    public Boolean getMundial() {
        return mundial;
    }

    public void tornaCampeao(){
        this.mundial = true;
    }

    public List<Time> getTimeAnteriores() {
        return timeAnteriores;
    }

    public void setTimeAnteriores(List<Time> timeAnteriores) {
        this.timeAnteriores = timeAnteriores;
    }

    @Override
    public String toString() {
        return "Joagador " +
                "Nome: '" + nome + '\'' +
                ", Gols: " + gols +
                ", Mundial: " + mundial;
    }
}
