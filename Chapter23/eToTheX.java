import java.util.Scanner;

public class eToTheX{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double term, sum, powerRaised, n;

        System.out.println("Enter X");
        powerRaised = scan.nextInt();

        term = 1;
        sum = 1;
        n = 1;

        while (term >= 1e-12){
            term *= (powerRaised/n);
            sum += term;
            n += 1;
        }

        System.out.println("With the series method: e^" + powerRaised + "=" + sum);
        System.out.println("With exponents: e^" + powerRaised + "=" + Math.exp(powerRaised));
    }

}