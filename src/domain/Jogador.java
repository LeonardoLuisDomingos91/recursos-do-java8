package domain;

public class Jogador {

    private String nome;
    private Integer gols;
    private Boolean mundial;

    public Jogador(String nome, Integer gols) {
        this.nome = nome;
        this.gols = gols;
        this.mundial = false;
    }

    public String getNome() {
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

    @Override
    public String toString() {
        return "Joagador " +
                "Nome: '" + nome + '\'' +
                ", Gols: " + gols +
                ", Mundial: " + mundial;
    }
}
