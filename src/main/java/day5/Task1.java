package day5;

public class Task1 {
    public static void main(String[] args) {
        Car car = new Car();
        car.setColor("black");
        car.setModel("Tesla");
        car.setYear(2020);

        System.out.println("Our car: " + car.getYear() + " year " + car.getColor() + " color " + car.getModel() + " model");
    }
}
