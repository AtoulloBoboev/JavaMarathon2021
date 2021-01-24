package day3;

import java.util.Scanner;

public class Task3 {

        public static void main(String[] args) {
            Scanner it = new Scanner(System.in);
            int c = 0;
            while (c<5){
                c++;
                double a, b;
                System.out.print("Введите первое число? ");
                a = it.nextDouble();
                System.out.print("Введите второе число? ");
                b = it.nextDouble();

                if (b==0) {
                    System.out.println("Деление на 0");
                    continue;
                }
                System.out.println("Ответ: " + (a/b));
            }
    }
}
