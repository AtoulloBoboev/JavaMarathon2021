package day6;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setColor("black");
        car.setModel("tesla");
        car.setYear(2020);

        Motorbike motorbike = new Motorbike(2010, "black", "kawasaki");

        car.info();
        motorbike.info();

        System.out.println(car.yearDifference(1900));
        System.out.println(motorbike.yearDifference(2020));
    }
}