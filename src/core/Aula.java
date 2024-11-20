package core;

import classetta.core.Studente;

public class Aula {

    public static void main(String[] args) {
        Integer[] votoIniziale = {};
        Studente studente = new Studente("Dario", "Mongardini", 123,votoIniziale);
        studente.Inserimento();
        Float media=studente.Media();
        if(media != null){
            System.out.println("la media e': " + media);
        }
        Integer max = studente.Maggiore();
        System.out.println("il numero maggiore e': " + max);
        //ho instanziato gli oggetti della mia classe studente
    }
}
