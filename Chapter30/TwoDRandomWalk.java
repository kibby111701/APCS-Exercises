import java.util.*;

public class TwoDRandomWalk{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x, y, xPlus, yPlus, distance; 
        int i, finalStep;
        x = 0;
        y = 0;

        System.out.println("Enter the number of iterations you want");
        finalStep = scan.nextInt();
        i = 0
        
        while (i < finalStep){
            xPlus = (Math.random()*2) - 1;
            yPlus = (Math.random()*2) - 1;
            x += xPlus;
            y += yPlus;
        }
    }

}