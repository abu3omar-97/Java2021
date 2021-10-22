package Week5;

public class DigitsInANumber {
    public static void main(String[] args) {
        // 122 -> 3
        // -> SUM OF ALL DIGITS = 5

        int number = 122;
        int temp = number;

        int sumOfAllDigits = 0;
        int numberOfDigits = 0;

        while(temp != 0){
            numberOfDigits++;
            sumOfAllDigits += temp%10; // LAST DIGIT FROM THE RIGHT = temp%10
            temp/=10;
        }

        System.out.println(numberOfDigits);
        System.out.println(sumOfAllDigits);

    }
}
