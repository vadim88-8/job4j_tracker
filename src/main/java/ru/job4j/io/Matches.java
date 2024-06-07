package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Игра 11.");
        boolean turn = true;
        int count = 11;
        while (count > 0) {
            String player = turn ? "Первый игрок" : "Второй игрок";
            System.out.println(player + " введите число от 1 до 3:");
            int matches = Integer.parseInt(input.nextLine());
            turn = !turn;
            boolean isCorrect = false;
            while (!isCorrect) {
                if ((matches > 0 && matches < 4) && count >= matches) {
                    count -= matches;
                    isCorrect = true;
                    System.out.println("Осталось " + count + " спичек");
                } else {
                    System.out.println("Необходимо ввести цифру от 1 до 3");
                    matches = Integer.parseInt(input.nextLine());
                }
            }
        }
        if (!turn) {
            System.out.println("Выиграл первый игрок");
        } else {
            System.out.println("Выиграл второй игрок");
        }
    }
}