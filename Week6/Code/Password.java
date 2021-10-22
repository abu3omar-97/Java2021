package Week5;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // OBJECT INITIALIZATION
        final int PASSWORD_STORED_IN_DATABASE = 1234;

        System.out.println("PLEASE ENTER UR PASSWORD");
        int passwordFromUser = input.nextInt();

        boolean isValidPassword = PASSWORD_STORED_IN_DATABASE == passwordFromUser;

        int tryIt = 0;
        while (!isValidPassword && tryIt < 2){
            System.out.println("PASSWORD NOT VALID ... TRY AGAIN");
            passwordFromUser = input.nextInt();
            isValidPassword = PASSWORD_STORED_IN_DATABASE == passwordFromUser;
            tryIt++;
        }

        if(isValidPassword){
            System.out.println("LOGIN");
        }




    }
}
