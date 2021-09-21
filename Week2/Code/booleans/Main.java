package booleans;

import javax.swing.*;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int userIDfromDB = 21;
        int phoneNumberInDB = 9999;
        int passwordFromDB = 1234; // TODO: GET VALUE FROM DB
        System.out.println("PLEASE ENTER USERID OR PHONE NUMEBR");
        int userCodeFromUser = input.nextInt();
        System.out.println("PLEASE ENTER PASSWORD");
        int passwordFromUser = input.nextInt();

        boolean isPasswordCorrect = passwordFromUser == passwordFromDB;
        boolean isUserIdCorrect = userCodeFromUser == userIDfromDB;
        boolean isPhoneNumberCorrect = phoneNumberInDB == userCodeFromUser;
        boolean isAuthenticated = (isUserIdCorrect || isPhoneNumberCorrect) && isPasswordCorrect;

        System.out.println("CAN I LOG IN??? " + isAuthenticated);



}

}
