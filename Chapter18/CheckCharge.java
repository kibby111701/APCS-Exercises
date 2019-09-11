import java.util.Scanner;

public class CheckCharge{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int checkingAmount, savingsAmount;

        System.out.println("Enter the amount in your checking account");
        checkingAmount = scan.nextInt();
        System.out.println("Enter the amount in your savings account");
        savingsAmount = scan.nextInt();

        if (checkingAmount >= 1000 || savingsAmount >= 1500){
            System.out.println("There is no service charge for writing checks");
        }
        else{
            System.out.println("The service charge is $0.15 per check");
        }

    }


}