package Week7;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        int height = Integer.parseInt(JOptionPane.showInputDialog(null, "ENTER YOUR HEIGHT:"));
        int totalCost = 0;

        if(height < 120){
            JOptionPane.showMessageDialog(null,"YOU CAN'T RIDE");
        }
        else {
            int age = Integer.parseInt(JOptionPane.showInputDialog(null, "ENTER YOUR AGE:"));

            if(age<12) {totalCost += 5;}
            else if(age >= 12 && age < 18) {totalCost += 7;}
            else if(age >= 18) {totalCost += 12;}

            int wantPhotos = JOptionPane.showConfirmDialog(null, "WANT PHOTOS?");
            if(wantPhotos == JOptionPane.YES_OPTION){
                totalCost += 5;
            }

            JOptionPane.showMessageDialog(null, "YOUR BILL IS: " + totalCost);
        }


    }
}
