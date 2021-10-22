package Week5;

public class Main {

    public static void main(String[] args) {

        String text = "I am @ Yaman";
        String phoneNumber = "0799999222";

        int positionOfAt = text.indexOf("@");
        String left = text.substring(0,positionOfAt);
        String right = text.substring(positionOfAt+1);

        // SPLIT THE TEXT AT THE "@" SYMBOL
        // leftHandSide = "I am"
        // rightHandSide = "Yaman"

        // 079 ZAIN
        // 078 UMNIA
        // 077 ORANGE

    }
}
