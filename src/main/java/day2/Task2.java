package day2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner it = new Scanner(System.in);
        int a, b;
        System.out.print("Enter the first number: ");
        a = it.nextInt();
        System.out.print("Enter the second number: ");
        b = it.nextInt();
        if (a >= b) {
            System.out.println("Некорректный ввод");
        }
        for (int i = a + 1; i < b; i++) {
            if (i % 5 == 0 && i % 10 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
