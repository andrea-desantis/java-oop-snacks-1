package org.snacks.studente;



public class Main {
    public static void main (String[] args){
        Studente esempio1 = new Studente("Andrea", "De Santis", 20);

        Studente esempio2 = new Studente("Pinco", "Pallino", 69);

        System.out.println(esempio1.getInfo());
        
        System.out.println(esempio2.getInfo());
    }
}
