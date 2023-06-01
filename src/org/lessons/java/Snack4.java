package org.lessons.java;

import java.util.Scanner;

public class Snack4 {
    public static void main(String[] args) {
        //Data in input una stringa verificare se è palindroma
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci una stringa: ");
        String input = scanner.nextLine();

        boolean isPalindroma = true;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                isPalindroma = false;
                break;
            }
        }

        if (isPalindroma) {
            System.out.println("la stringa è palindroma");
        } else {
            System.out.println("la stringa non è palindroma");
        }

        scanner.close();
    }
}
