package ATM;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // CREATED AN INSTANCE FROM SCANNER
        Scanner input = new Scanner(System.in);
        String pinFromDB = "12345"; // TODO: CONNECT TO DB

        // 1- Balance
        // 2- Withdraw
        // 3- Deposit
        // 4- Change Password

        System.out.println("Welcome To Java Bank ATM ... ");

        System.out.println("ENTER YOUR PIN");
        String pinFromUser = input.nextLine();

        boolean isValidPin = pinFromUser.equals(pinFromDB);
        System.out.println(isValidPin);

        if(isValidPin) {

            System.out.println("Please Choose  ... \n1- Balance \n" +
                    "2- Withdraw \n" +
                    "3- Deposit \n" +
                    "4- Change Password ");


            int choice = input.nextInt();
            final int DISPLAY_BALANCE = 1;
            if(choice==DISPLAY_BALANCE){
                System.out.println("YOUR BALANCE IS: " +"9999"); // TODO: REPLACE WITH A VAR
            }

        }



    }
}
