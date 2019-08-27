import java.util.Scanner;

public class LogBase2{
    public static void main(String[] args) {
        
        double inputNumber, logResult;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a double");
        inputNumber = scan.nextDouble();

        logResult = (Math.log(inputNumber))/(Math.log(2));

        System.out.println("Log base 2 of " + inputNumber + " is " + logResult);


    }



}