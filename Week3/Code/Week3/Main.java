package Week3;

public class Main {

    public static void main(String[] args) {

        String post1 = "Be kind to everyone and dfgdfgcats. Never think you're above others.The trouble with those who appear pious is that they think they’re on a higher level and scoff at everyone else who may seem less pious! It’s a terrible trait to have. Don’t be hard on people. Piety comes with gentleness.\n";

                // CATEGORY

        boolean containsCars = post1.contains("car")  ||  post1.contains("mercedes"); // car , wheel , mercedes , bmw ,
        boolean containsAnimals = post1.contains("animal")  ||  post1.toLowerCase().contains("Cat".toLowerCase());

        System.out.println(containsCars);
        System.out.println(containsAnimals);

    }
}
