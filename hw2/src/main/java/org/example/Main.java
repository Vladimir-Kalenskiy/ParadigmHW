package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = getNum();
        Multi(n);
    }

    public static int getNum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число от 1 до 9: ");
        return sc.nextInt();
    }

    public static void Multi(int number) {
        if (number >= 1 && number <= 9) {
            for (int i = 1; i <= number; i++) {
                System.out.println("********");
                for (int j = 1; j <= 9; j++) {
                    System.out.println(i + "*" + j + "=" + i * j);
                }
            }
        } else System.err.println("Error!!!");
    }
}