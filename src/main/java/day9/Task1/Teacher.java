package day9.Task1;

public class Teacher extends Human {
    private String nameOfSubject;

    public Teacher(String name, String nameOfSubject) {
        super(name);
        this.nameOfSubject = nameOfSubject;
    }

    public String getNameOfSubject() {
        return nameOfSubject;
    }

    public void setNameOfSubject(String nameOfSubject) {
        this.nameOfSubject = nameOfSubject;
    }

    public void printInfo() {
        super.printInfo();
        System.out.println("Этот преподователь с именем " + getName());
    }
}
