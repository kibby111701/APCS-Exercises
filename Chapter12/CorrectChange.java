import java.util.Scanner;

public class  CorrectChange{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int changeDue, dollars, quarters, dimes, nickels, pennies;
        
        System.out.println("Input the change due:");
        changeDue = scan.nextInt();
        dollars = changeDue/100;
        changeDue = changeDue % 100;
        quarters = changeDue/25;
        changeDue = changeDue % 25;
        dimes = changeDue/10;
        changeDue = changeDue % 10;
        nickels = changeDue/5;
        pennies = changeDue % 5;

        System.out.println("Your change is: " + dollars + " dollars, " + 
            quarters + " quarters, " + dimes + " dimes, " + nickels + " nickels and " + pennies + " pennies.");

        
    }



}