import java.util.Scanner;

public class OhmsLaw{
    public static void main(String[] args) {
        Scanner scan1 = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        int voltage, resistance; 
        double current;

        System.out.println("Gimme the voltage");
        voltage = scan1.nextInt();
        System.out.println("Gimme the resistance");
        resistance = scan2.nextInt();

        current = (voltage + 0.0)/(resistance + 0.0);
        System.out.println("The current is " + current + " amps.");
    }



}