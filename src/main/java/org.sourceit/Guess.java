package org.sourceit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Guess {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader rd = new BufferedReader( new InputStreamReader(System.in));
        Random r = new Random();
        // Генерируем число от 0 до 100
        int x = r.nextInt(100)+1;
        int i;
        // Число попыток
        int counter = 0;
        System.out.print("ВИКТОРИНА");
        do {
            System.out.print("\n" + "Угадайте число: ");
            i = Integer.parseInt(rd.readLine());

            counter++;

            if(i>x) {
                System.out.print("Много");
            }
            if(i<x) {
                System.out.print("Мало");
            }
        }
        while ((i!=x) && (counter<7));

        if (i == x) {
            System.out.print("Вы угадали!!!");
            System.out.printf("Число попыток: %d", counter);
        }
        else {
            System.out.print("GAME OVER!");
            System.out.printf("Загаданное число: %d ", x);
        }
    }
}