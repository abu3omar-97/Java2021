package Week2Part2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String name = "  Mohammad  ";
        System.out.println(name.trim());
        System.out.println(name);
        int nameLength = name.length();
        System.out.println("THE LENGTH OF " + name + " IS " + nameLength );

        System.out.println(name.trim().length());
        // name.trim().length()
        // 1-> name.trim() -> "Mohammad"
        // 2-> "Mohammad".length() -> 8

        System.out.println("YAMAN".toLowerCase());

        int l =  name.trim().length();


    }
}
