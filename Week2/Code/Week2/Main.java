package Week2;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Input: hourly rate, weekly hours (A month is 4 weeks),
        // month overtime (overtime hours are paid one and a half)
        // Print True if the user has worked for overtime, and false otherwise
        // Print True if the user earns more than $400 dollars per month

        // What is your standard hourly pay rate?
        // How many hours do you work in a week (without overtime)?
        // How many hours do you work as over time per month?

        Scanner input = new Scanner(System.in);

        // USER INPUT
        System.out.println("What is your standard hourly pay rate?");
        double payRate = input.nextDouble();
        System.out.println("How many hours do you work in a week (without overtime)? ");
        int hoursPerWeek = input.nextInt();
        System.out.println("How many hours do you work as over time per month? ");
        int hoursOverTimePerMonth = input.nextInt();


        boolean hasOverTime = hoursOverTimePerMonth  > 0;

        final int WEEKS_PER_MONTH = 4;
        double totalSalary = (hoursPerWeek * WEEKS_PER_MONTH * payRate) + (hoursOverTimePerMonth*1.5*payRate);

        boolean isSalaryGreaterThan400 = totalSalary > 400;

        System.out.println("TOTAL SALARY: " + totalSalary); // TODO: TO BE REMOVED

        System.out.println("OVERTIME??? " + hasOverTime);
        System.out.println("isSalaryGreaterThan400??? " + isSalaryGreaterThan400);


    }
}
