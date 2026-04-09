package org.snacks.studente;

public class Studente {
    private String nome;
    private String cognome;
    private int eta;

    // costruttore
    public Studente (String nome, String cognome, int eta){
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
    }

    // metodo valori concatenati

    public String getInfo(){
        return nome + " " + cognome + ", " + eta + " anni";
    }
}
