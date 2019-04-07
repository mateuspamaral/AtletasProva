package br.com.digitalhouse;

public class Exercicio3 {
    public static void main(String[] args) {
        Atleta mateus = new Atleta("Mateus", 20,20 );
        Atleta carolina = new Atleta("Carolina", 5,30);

        Prova bbb = new Prova(10,10);

        System.out.println(bbb.prova(mateus));
        System.out.println(bbb.prova(carolina));
    }
}
