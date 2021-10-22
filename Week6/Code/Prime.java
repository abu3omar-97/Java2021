package Week5;

public class Prime {
    public static void main(String[] args) {
        int x = 7;
        int y = 120;
        boolean isPrime = true;

        for (int j = x; j <= y ; j++) {
            for (int i = 2; i < j ; i++) {
                if(j % i == 0 ) {
                    isPrime = false;
                    break;
                }
            }
            String result = isPrime ? j + " IS PRIME" : j + " IS NOT PRIME";
            System.out.println(result);
            isPrime = true;
        }



    }
}
