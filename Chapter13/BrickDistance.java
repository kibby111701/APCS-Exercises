import java.util.Scanner;

public class BrickDistance{
    public static void main(String[] args) {
        double time, distance;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of seconds");
        time = scan.nextDouble();
        distance = ((time*time)*32.174)/2;

        System.out.println("Distance: " + distance); 


    }


}