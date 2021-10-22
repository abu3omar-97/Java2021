
import java.util.Scanner;

public class Main4 {
    public static void main(String[] args) {

        boolean hasPermit = false;

        Scanner input = new Scanner(System.in);
        String plateNumber = input.nextLine(); // 18-12312

        String lastDigit = plateNumber.substring(plateNumber.length()-1);
        System.out.println(lastDigit);

        String validation = Integer.parseInt(lastDigit) % 2 == 0  || hasPermit ? "PASS" : "JAIL";
        JOptionPane.showMessageDialog(null, validation);






    }
}
