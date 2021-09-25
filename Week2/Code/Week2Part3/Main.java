package Week2Part3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        String name = "Ali";
//        char firstLetter = name.charAt(0);
//        char lastLetter = name.charAt(name.length()-1);
//        String lastLetterToUpperCase = (lastLetter+"").toUpperCase();
////        String lastLetterToUpperCase = Character.toString(lastLetter).toUpperCase();
//        System.out.println( lastLetterToUpperCase);

        Scanner input = new Scanner(System.in);
        System.out.println("PLEASE ENTER THE PLATE NUMBER");
        int plate = input.nextInt();
        String plateString = plate+"";

        int plateLength = plateString.length();

        boolean isSpecial = plateLength <= 4;

        System.out.println(isSpecial);





    }
}
