package Week7;

public class Number {
    public static void main(String[] args) {
        int num = 123;
        int temp = num;



        int counter = 0; // NUMBER OF DIGITS
        int sumOfDigits = 0; // SUM OF DIGITS

        // PALINDROME
        // 123321 -> TRUE
        // 12321 -> TRUE
        // 12312 -> FALSE

        // isPalindrome -> return num == reversed(num)

        int reversed = 0;

        while (temp != 0){
            int lastDigitFromRight = temp % 10;
            sumOfDigits += lastDigitFromRight;
            temp = temp/10;
            counter++;
            reversed = reversed * 10 + lastDigitFromRight;
        }

        System.out.println("NUMBER OF DIGITS IN " + num+  " IS: " + counter);
        System.out.println("SUM OF DIGITS IN " + num+  " IS: " + sumOfDigits);
        System.out.println("REVERSED NUMBER OF " + num+  " IS: " + reversed);
        boolean isPalindrome = num == reversed ? true : false;
        System.out.println(isPalindrome);

    }
}
