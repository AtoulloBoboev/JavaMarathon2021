package day3;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner string = new Scanner(System.in);
        String countries;
        while (true){
        System.out.print("Какой город? ");
        countries= string.nextLine();
        if (countries.equals("Stop"))
        break;

        switch (countries){
            case "Москва":
            case "Владивосток":
            case "Ростов":
                System.out.println("Этот город находится в России");
                break;
            case "Рим":
            case "Милан":
            case "Турин":
                System.out.println("Этот город находится в Италии");
                break;
            case "Ливерпуль":
            case "Манчестер":
            case "Лондон":
                System.out.println("Этот город находится в Англии");
                break;
            case "Берлин":
            case "Мюнхен":
            case "Кёльн":
                System.out.println("Этот город находится в Германии");
                break;
            default:
                System.out.println("Неизвестная страна");
        }
    }
}}
