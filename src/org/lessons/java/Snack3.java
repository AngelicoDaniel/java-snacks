package org.lessons.java;

public class Snack3 {
    public static void main(String[] args) {
        //Crea un array di numeri interi e fai la somma di tutti gli elementi che sono in posizione dispari
        int[] numbers = {1, 2, 5, 6, 7, 3, 10, 20, 7};
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 != 0) {
                sum += numbers[i];
            }
        }
        System.out.println("Somma: " + sum);
    }
}
