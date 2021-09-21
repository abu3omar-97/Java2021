package booleans;

public class Main2 {
    public static void main(String[] args) {

        // A,B,C .... Z
        // a,b,c ... z

        // IS UPPERCASE?
        // IS LOWERCASE?
        // IS ALPHABET?

        char charToTest = 'a';

        boolean isUpper = charToTest >= 'A' && charToTest <= 'Z';

        char charToTestInUpper = (char) (charToTest - 32);
        System.out.println("RESULT: " + charToTestInUpper);


    }
}
