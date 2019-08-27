import java.util.Scanner;

public class ApplianceCost{
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        double costPerHour, annualCost;
        int kHour;


        System.out.println("Enter cost per kilowatt-hour in cents");
        costPerHour = scan.nextDouble();
        System.out.println("Enter kilowatt-hours used per year");
        kHour = scan.nextInt();

        annualCost = (costPerHour * kHour) / 100;

        System.out.println("Annual cost: " + annualCost);

    }



}