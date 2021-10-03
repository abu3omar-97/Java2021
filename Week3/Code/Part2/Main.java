package Part2;

public class Main {
    public static void main(String[] args) {

        String zipCode = "88410";

        String nationalArea = zipCode.substring(0,1);
        System.out.println(nationalArea);
        String sectionalArea = zipCode.substring(1,3);
        System.out.println(sectionalArea);

    }
}
