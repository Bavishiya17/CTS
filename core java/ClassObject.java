import java.util.Scanner;
class Car {
    String make, model;
    int year;
    Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    void displayDetails() {
        System.out.println(make + " " + model + " " + year);
    }
}
public class ClassObject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String make = sc.nextLine();
        String model = sc.nextLine();
        int year = sc.nextInt();
        Car c = new Car(make, model, year);
        c.displayDetails();
    }
}