package br.com.digitalhouse;

public class Atleta {
    //Attributes
    private String nome;
    private Integer nivel;
    private Integer energia;

    //Constructors
    public Atleta(String nome, Integer nivel, Integer energia) {
        this.nome = nome;
        this.nivel = nivel;
        this.energia = energia;
    }

    //Getters & Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNivel() {
        return nivel;
    }

    public void setNivel(Integer nivel) {
        this.nivel = nivel;
    }

    public Integer getEnergia() {
        return energia;
    }

    public void setEnergia(Integer energia) {
        this.energia = energia;
    }

}
