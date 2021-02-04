package day7;


/**
 * Для этого задания скопируйте класс Самолет из шестого дня (Task2) в пакет текущего дня.
 * В классе Самолет реализовать статический метод compareAirplanes, который в качестве аргументов принимает два объекта класса Airplane (два самолета)
 * и выводит сообщение в консоль о том, какой из самолетов длиннее.
 */

public class Task1 {
    public static void main(String[] args) {
        Airplane airplane1 = new Airplane("Boeing", 2010, 80, 90000);
        Airplane airplane2 = new Airplane("Airbus", 2013, 65, 40000);

        Airplane.compareAirplanes(airplane1, airplane2);
    }
}