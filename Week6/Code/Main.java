package WeekFour;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        final int YES = 0;
        final int NO = 1;
        final int CANCEL = 2;
        int answer = JOptionPane.showConfirmDialog(null, "DO YOU LIKE COFFEE?");
        String msg = "THE ANSWER IS: " + answer;

        if(answer == YES) {
            String numberOfSugarSpoons = JOptionPane.showInputDialog("HELLO");
            int number = Integer.parseInt(numberOfSugarSpoons) - 2;
            System.out.println("#SUGAR " + number);
        }
        else {
            JOptionPane.showMessageDialog(null, "GOODBYE");
        }

    }
}
