import java.util.Scanner;

public class CentsToDollars{
    public static void main (String[] args){
        
        Scanner scan = new Scanner(System.in);

        int initialCents;
        int dollars;
        int finalCents;

        System.out.println("Input the cents:");
        initialCents = scan.nextInt();

        dollars = initialCents/100;
        finalCents = initialCents%100;

        System.out.println("That is " +dollars+ " dollars and " + finalCents + " cents.");


    }



}