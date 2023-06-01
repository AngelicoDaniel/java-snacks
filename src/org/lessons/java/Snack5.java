package org.lessons.java;

import java.util.Scanner;

public class Snack5 {
    public static void main(String[] args) {
        //Data una stringa in input mostrare a video quanti caratteri alfabetici contiene, quanti numeri e quanti simboli non alfanumerici.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Stringa: ");
        String input = scanner.nextLine();

        int caratteri = 0;
        int numeri = 0;
        int simboli = 0;

        for (int i = 0; i < input.length(); i++) {
            char carattere = input.charAt(i);
            if (Character.isLetter(carattere)) {
                caratteri++;
            } else if (Character.isDigit(carattere)) {
                numeri++;
            } else {
                simboli++;
            }
        }

        System.out.println("Caratteri: " + caratteri);
        System.out.println("Numeri: " + numeri);
        System.out.println("Simboli: " + simboli);

        scanner.close();
    }
}
