import java.util.Scanner;

public class DiscountPrices{
    public static void main(String[] args) {
        int initialCost, discountCost;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the amount of the purchase in cents");
        initialCost = scan.nextInt();

        if (initialCost >= 1000){
            discountCost = (initialCost/10) * 9;
        }
        else{
            discountCost = initialCost;
        }

        System.out.println("The discount cost is: " + discountCost);
    }

}