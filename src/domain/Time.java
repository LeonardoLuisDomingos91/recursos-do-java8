package domain;

import java.util.List;

public class Time {

    private String nome;

    public Time(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Time{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
