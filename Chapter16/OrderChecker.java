import java.util.Scanner;

public class OrderChecker{
    public static void main(String[] args) {
        final int boltPrice = 5;
        final int nutPrice = 3;
        final int washPrice = 1;
        Scanner scan = new Scanner(System.in);
        int numberBolts, numberNuts, numberWash, totalCost;

        System.out.println("Number of bolts:");
        numberBolts = scan.nextInt();
        System.out.println("Number of nuts:");
        numberNuts = scan.nextInt();
        System.out.println("Number of washers:");
        numberWash = scan.nextInt();

        totalCost = (numberBolts * boltPrice) + (numberNuts * nutPrice) + (numberWash * washPrice);


        System.out.println("Check the order:");
        if (numberNuts < numberBolts){
            System.out.println("too few nuts");
        }
        
        if (numberWash < 2*numberBolts){
            System.out.println("too few washers");
        }

        if (numberNuts >= numberBolts && numberWash >= 2*numberBolts){
            System.out.println("Order is OK");
        }

        System.out.println("Total cost: " + totalCost);
    }

}