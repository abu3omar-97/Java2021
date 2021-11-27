package Week7;

public class Week8Q1 {
    public static void main(String[] args) {
        // X, Y, Z
        int x = 3, y=9, z=18;

        int differenceYX = y-x;
        int differenceZY = z-y;

        if(differenceYX < differenceZY){
            for (int i = x; i <= y; i++) {
                System.out.println(i);
            }
        }
        else {
            for (int i = y; i <= z; i++) {
                System.out.println(i);
            }
        }




    }
}
