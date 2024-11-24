package core;

import classetta.core.Studente;

public class Aula {

    public static void main(String[] args) {
        Integer[] votoIniziale = {};
        Studente studente = new Studente("Dario", "Mongardini", 123,votoIniziale);
        studente.inserimento();
        Float media=studente.media();
        if(media != null){
            System.out.println("la media e': " + media);
        }
        Integer max = studente.maggiore();
        System.out.println("il numero maggiore e': " + max);
        //ho instanziato gli oggetti della mia classe studente
    }
}
