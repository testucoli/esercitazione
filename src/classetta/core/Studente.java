package classetta.core;
import java.util.*;

public class Studente {

    private String nome;
    private String cognome;
    private Integer matricola;
    private Integer[] voti;
    //instance field

    public Studente(String ilNome, String ilCognome, Integer laMatricola, Integer[] iVoti) {
        System.out.println("creazione dello studente: " + ilNome + " " + ilCognome);
        nome = ilNome;
        cognome = ilCognome;
        matricola = laMatricola;
        voti = iVoti;
    }//costruttore


    public void inserimento(){
        Scanner input = new Scanner(System.in);
        System.out.println("quanti voti vuoi inserire: ");
        int n = input.nextInt();
        while (n > 20 || n <= 0){
            System.out.println("il numero non è valido");
            n = input.nextInt();

        }
        voti = new Integer[n];

        for (int i = 0; i < n; i++) {
            int voto;
            do {
                System.out.println("Inserisci il voto " + (i + 1) + " (compreso tra 0 e 10): ");
                voto = input.nextInt();
                if (voto > 10 || voto < 0) {
                    System.out.println("Errore: non accetto voti sopra il 10 e minori di 0. Riprova.");
                }
            } while (voto > 10 || voto < 0); // continuo a chiedere finche non è valido il voto

            voti[i] = voto;
        }


        System.out.println("voti inseriti");
    }


    public Float media(){
        float somma = 0;
        float media;

        for(int voto : voti) {
            somma += voto;
        }
        media = somma / voti.length;

        return media;
        }

    public Integer maggiore(){
        int Max = voti[0];
        int n=voti.length;
        for(int i=1; i < n; i++){
            if(voti[i] > Max){
                Max = voti[i];
            }
        }
        return Max;
    }




    }



