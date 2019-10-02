import java.util.*;

public class TwoDRandomWalk{
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        double x, y, xPlus, yPlus, distance; 
        int finalStep;
        x = 0;
        y = 0;

        System.out.println("Enter the number of iterations you want");
        finalStep = scan.nextInt();
        
        for (int i = 0; i < finalStep; i++){
            xPlus = rand.nextDouble()*2 - 1;
            yPlus = rand.nextDouble()*2 - 1;
            x += xPlus;
            y += yPlus;
        }

        distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));

        System.out.println("X: " + x);
        System.out.println("Y: " + y);
        System.out.println("Distance: " + distance);
    }

}