package Week5;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // OBJECT INITIALIZATION
        System.out.println("PLEASE ENTER N");
        int n = input.nextInt();

        // n = 5 -> 1 + 2 + 3 + 4 + 5

        int sum = 0;
        int product = 1;

        for (int i = 1; i <= n ; i++) {
            sum += i; // sum = sum + i;
            product *= i; // product = product*i;
        }
            System.out.println(sum);
            System.out.println(product);


    }
}
