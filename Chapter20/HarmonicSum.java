import java.util.Scanner;

public class HarmonicSum{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int finalNumber, counter;
        double sum;

        System.out.println("Enter the final number");
        finalNumber = scan.nextInt();

        sum = 0;
        counter = 1;

        while (counter <= finalNumber){
            sum += 1.0/counter;
            counter += 1;
        }

        System.out.println("The sum is " + sum);
    }

}