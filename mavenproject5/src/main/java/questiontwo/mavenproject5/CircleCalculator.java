/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questiontwo.mavenproject5;

/**
 *
 * @author CLIENT
 */
import java.util.Scanner;

class Circle {
    double radius;
    final double PI = 22.0 / 7.0;

    Circle(double r) {
        this.radius = r;
    }

    double calculateArea() {
        return PI * radius * radius;
    }

    double calculateCircumference() {
        return 2 * PI * radius;
    }
}

public class CircleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        Circle circle = new Circle(radius);
        double area = circle.calculateArea();
        double circumference = circle.calculateCircumference();

        System.out.println("Area of the circle: " + area);
        System.out.println("Circumference of the circle: " + circumference);
    }
}

