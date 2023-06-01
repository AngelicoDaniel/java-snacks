package org.lessons.java;

public class Snack9 {
    public static void main(String[] args) {
        //Calcola la somma e la media dei primi 10 numeri.
        int numbers = 10;
        int sum = 0;
        double media;

        for (int i = 0; i <= numbers; i++) {
            sum += i;
        }

        media = (double) sum / numbers;

        System.out.println("La somma dei numeri è: " + sum);
        System.out.println("La media dei numeri è: " + media);
    }
}
