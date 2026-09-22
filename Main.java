class cars {
    String Model_Name;
    String Model_code;
    int Model_id;

    public void display_name(){
        System.out.println("Model name: "+Model_Name);
    }
    public void display_code(){
        System.out.println("Model name: "+Model_code);
    }

    public void display_id(){
        System.out.println("Model id: "+Model_id);
    }
    public static void main(String[] args){
        cars c1 = new cars();
        c1.Model_Name = "Honda";
        c1.Model_code = "HD1234";
        c1.Model_id = 44;
        c1.display_name();
        c1.display_code();
        c1.display_id();
    }
}
class Car {

    private String model;
    private String color;
    private int speed;

    public void setParameters(String m, String c, int s) {
        model = m;
        color = c;
        speed = s;
    }

    public void display() {
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Speed: " + speed);
    }

    public void start() {
        System.out.println("Car is started");
    }

    public void stop() {
        System.out.println("Car is stopped");
    }
}

public class CarDemo {

    public static void main(String[] args) {

        Car car1 = new Car();

        car1.setParameters("Toyota Corolla", "White", 60);
        car1.start();
        car1.display();
        car1.stop();


        Car car2 = new Car();

        car2.setParameters("Honda Civic", "Black", 80);
        car2.start();
        car2.display();
        car2.stop();
    }
}
class Time {

    public int hour;
    public int minute;
    public int second;

    public void displayTime() {
        System.out.println(hour + ":" + minute + ":" + second);
    }
}

public class TimeDemo {

    public static void main(String[] args) {

        Time time1 = new Time();

        time1.hour = 10;
        time1.minute = 30;
        time1.second = 45;

        System.out.println("Time 1:");
        time1.displayTime();


        Time time2 = new Time();

        time2.hour = 5;
        time2.minute = 15;
        time2.second = 20;

        System.out.println("Time 2:");
        time2.displayTime();
    }
}
class Student {

    public String name;
    public String rollNumber;
    public String program;
    public int semester;

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Program: " + program);
        System.out.println("Semester: " + semester);
    }

    public void markPresent() {
        System.out.println("Student is Present");
    }

    public void markAbsent() {
        System.out.println("Student is Absent");
    }
}

public class Studentsbehaviour {

    public static void main(String[] args) {

        Student s1 = new Student();

        s1.name = "Ali";
        s1.rollNumber = "FA25-BMD-001";
        s1.program = "Mathematics and Data Science";
        s1.semester = 3;

        s1.markPresent();
        s1.display();

        Student s2 = new Student();

        s2.name = "Abu zar";
        s2.rollNumber = "FA25-BMD-005";
        s2.program = "Mathematics and Data Science";
        s2.semester = 3;

        s2.markAbsent();
        s2.display();
    }
}
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        System.out.println("Name: "+name);
        System.out.println("Age: "+age);


    }
}

import java.util.Scanner;
class Area{
    int length,width;

}

