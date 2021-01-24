package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner it = new Scanner(System.in);
        while (true){
            double a, b,c;
            System.out.print("Введите первое число? ");
            a = it.nextDouble();
            System.out.print("Введите второе число? ");
            b = it.nextDouble();
            c= a/b;
            if (b==0)
                break;
            System.out.println("Ответ: " + c);
        }
}}
