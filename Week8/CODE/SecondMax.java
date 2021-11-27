package Week7;

import java.util.Scanner;

public class SecondMax {
    public static void main(String[] args) {
        // FIND THE SECOND LARGEST NUMBER
        Scanner input = new Scanner(System.in);
        int number = 0;
        int max = 0;
        int secondMax = 0;
        for (int i = 0; i < 5; i++) {
            number = input.nextInt();
            if(i==0) { max = number; secondMax = number;}
            if(number > max) { secondMax = max; max = number;}
            else if(number > secondMax) { secondMax = number; }
        }

        System.out.println(secondMax);

    }
}
