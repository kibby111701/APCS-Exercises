import java.util.Scanner;

public class AddUpIntegers{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int intCounter, howManyInts, sum;

        System.out.println("How many integers will be added?");
        howManyInts = scan.nextInt();

        intCounter = 0;
        sum = 0;

        while (intCounter < howManyInts){
            System.out.println("Enter an integer:");
            sum += scan.nextInt();
            intCounter += 1;
        }

        System.out.println("The sum is " + sum);

    }

}