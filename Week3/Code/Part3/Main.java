package Part3;

public class Main {
    public static void main(String[] args) {

        String masterCard = "5434-4012-3454-7891";
        // *****7891

        String last4 = masterCard.substring(masterCard.length()-4);

        String securedMasterCard = "*****"+last4;
        System.out.println(securedMasterCard);
    }
}
