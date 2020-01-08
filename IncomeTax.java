import java.util.Scanner;

public class IncomeTax{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double yearlyIncome, taxesPaid, percentagePaid;

        System.out.println("This is the IRS. Pay your taxes, you filthy skank");

        System.out.println("Enter your yearly income");
        yearlyIncome = scan.nextDouble();

        if (yearlyIncome < 15000){
            taxesPaid = 0;
        }
        else if (yearlyIncome >= 15000 && yearlyIncome < 35000){
            taxesPaid = 0.1 * (yearlyIncome - 15000);
        }
        else if (yearlyIncome >= 35000 && yearlyIncome < 65000){
            taxesPaid = 2000 + (0.16 * (yearlyIncome - 35000));
        }
        else if (yearlyIncome >= 65000 && yearlyIncome < 105000){
            taxesPaid = 6800 + (0.19 * (yearlyIncome - 65000));
        }
        else{
            taxesPaid = 14400 + (0.22 * (yearlyIncome - 105000));
        }

        percentagePaid = (taxesPaid/yearlyIncome) * 100;

        System.out.println("Total paid: $" + taxesPaid);
        System.out.println(percentagePaid + "% of " + yearlyIncome);
    }
}