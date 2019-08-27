import java.util.Scanner;

public class HarmonicMean{
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        double x, y, arithMean, harmMean;

        System.out.println("Enter X:");
        x = scan.nextDouble();
        System.out.println("Enter Y:");
        y = scan.nextDouble();

        arithMean = (x+y)/2;
        harmMean = 2/((1/x) + (1/y));

        System.out.println("Arithmetic mean: " + arithMean);
        System.out.println("Harmonic mean: " + harmMean);




    }
}