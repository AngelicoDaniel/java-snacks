package org.lessons.java;

import java.util.Scanner;

public class Snack1 {
    public static void main(String[] args) {
        //Inserisci un numero, se è pari stampa il numero, se è dispari stampa il numero successivo.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println(number);
        } else {
            System.out.println(number + 1);
        }
        scanner.close();
    }
}
