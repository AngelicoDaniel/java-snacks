package org.lessons.java;

import java.util.Random;

public class Snack2 {
    public static void main(String[] args) {
        //Generatore di “nomi cognomi” casuali: il Grande Gatsby ha una lista di nomi e una lista di cognomi, e da queste vuole mostrare a video una falsa lista d'invitati con nome e cognome.
        
        String[] names = {"name1", "name2", "name3", "name4"};
        String[] surnames = {"surname1", "surname2", "surname3", "surname4"};

        Random random = new Random();

        int numeroInvitati = random.nextInt(10) + 1;

        for (int i = 0; i < numeroInvitati; i++) {
            int indexName = random.nextInt(names.length);
            int indexSurname = random.nextInt(surnames.length);
            String nome = names[indexName];
            String cognome = surnames[indexSurname];
            System.out.println(nome + " " + cognome);
        }

    }
}
