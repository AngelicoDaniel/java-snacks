package org.lessons.java;

import java.util.Scanner;

public class Snack8 {
    public static void main(String[] args) {
        //Snack8 Chiedi un numero di QUATTRO cifre all’utente e calcola la somma di tutte le cifre che compongono il numero
        Scanner scan = new Scanner(System.in);

        boolean validNumber = false;
        int number;
        do {
            System.out.print("Insert a 4 digit number: ");
            number = scan.nextInt();
            if (number > 999 && number < 10000) {
                // valid number
                validNumber = true;
            }
        } while (!validNumber);
        System.out.println("Your number: " + number);

        int sum = 0;
        int cifra;

        cifra = number / 1000;
        sum += cifra;

        cifra = (number / 100) % 10;
        sum += cifra;

        cifra = (number / 10) % 10;
        sum += cifra;

        cifra = number % 10;
        sum += cifra;

        System.out.println("La somma delle cifre è: " + sum);


        scan.close();
    }
}
