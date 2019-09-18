import java.util.Scanner;

public class PowerOfNumber{
    public static void main(String[] args) {
        int count, powerRaised;
        double whatNumber, sum;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter X");
        whatNumber = scan.nextDouble();
        System.out.println("Enter N");
        powerRaised = scan.nextInt();

        if (powerRaised <= 0){
            System.out.println("N must be a positive integer");
        }
        else {
            count = 0;
            sum = 1;
            while (count < powerRaised){
                sum *= whatNumber;
                count += 1;
            }

            System.out.println(whatNumber + " to the power of " + powerRaised + " is " + sum);
        }
    }

}