package br.com.digitalhouse;

public class Prova {
    //Attributes
    private Integer dificuldade;
    private Integer energiaNecessaria;

    //Constructors
    public Prova(Integer dificuldade, Integer energiaNecessaria) {
        this.dificuldade = dificuldade;
        this.energiaNecessaria = energiaNecessaria;
    }

    //Getters & Setters
    public Integer getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(Integer dificuldade) {
        this.dificuldade = dificuldade;
    }

    public Integer getEnergiaNecessaria() {
        return energiaNecessaria;
    }

    public void setEnergiaNecessaria(Integer energiaNecessaria) {
        this.energiaNecessaria = energiaNecessaria;
    }

    //Class methods
    public Boolean prova(Atleta atleta){
        return atleta.getNivel()>this.dificuldade && atleta.getEnergia()>this.energiaNecessaria;
    }
}
