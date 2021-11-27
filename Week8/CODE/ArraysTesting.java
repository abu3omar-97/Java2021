package Week7;

import java.util.Arrays;

public class ArraysTesting {
    public static void main(String[] args) {

//        String[] planets = { "Z", "A", "C", "ZA", "BC" , "BA" , "Ba" , "ba" ,  "X",  "B" , "b" };
//
//        System.out.println(Arrays.toString(planets));
//        Arrays.sort(planets);
//        System.out.println(Arrays.toString(planets));
////
//        for (int i = 0; i < planets.length; i++) {
//            System.out.println("planets["+ i + "] = " + planets[i]);
//        }


        int[] a = {5, 2, 4, 3, 1};
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length; i++) {
            a[i] *= -1;
        }
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            a[i] *= -1;
        }
        System.out.println(Arrays.toString(a));





    }
}
