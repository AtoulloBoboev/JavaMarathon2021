package day2;

import java.util.Scanner;

public class Task3 {
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
        int t = a + 1;
        while (t < b) {
            if (t % 5 == 0 && t % 10 != 0)
                System.out.println(t);
            t++;
        }
    }
}
