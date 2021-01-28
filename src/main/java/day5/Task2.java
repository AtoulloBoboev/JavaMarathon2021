package day5;


public class Task2 {
    public static void main(String[] args) {
        Motorbike bike = new Motorbike(2020, "black", "kawasaki");

        System.out.println(bike.getModel() + "\n " +
                bike.getColor() + " \n " +
                bike.getYear());
    }
}
