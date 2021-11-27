package Week7;

public class Factors {
    public static void main(String[] args) {
        // FACTORS

        int num = 20;

//        num % 1 == 0
//        num % 2 == 0
//        num % 3 == 0
//        num % 4 == 0
//        num % 5 == 0

        for (int i = 2; i <= num/2; i++) {
            if(num%i == 0) {
                System.out.println(i);
            }
        }

    }
}
