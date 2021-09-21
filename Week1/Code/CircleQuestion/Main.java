package CircleQuestion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // area = pie * r^2
        // perimeter = 2 * pie * r
        // pie = 3.14

        Scanner input = new Scanner(System.in);
        System.out.println("PLEASE ENTER THE RADIUS: ");
        double radius = input.nextDouble();
        double pie = 3.14;
        double area = pie * radius * radius;
        double perimeter = 2 * pie * radius;

        System.out.println("A = " + area + "\nP= " + perimeter);

    }
}
