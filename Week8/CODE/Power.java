package Week7;

public class Power {
    public static void main(String[] args) {

        int b,e;
        b= 5;
        e= 2;

        int result = 1;

        for (int i = 1; i <= e; i++) {
            result = result * b;
        }

        System.out.println(result);

        // 5! -> 5 * 4 * 3 * 2 * 1;

        int num = 5;
        int fact = 1;
        for (int i = 1; i <= num ; i++) {
            fact = fact * i;
        }

        System.out.println(fact);
    }
}
