import java.util.Scanner;

public class MilesPerGallon{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        double initialMiles, finalMiles, gallons, milesGallon;

        initialMiles = 1;

        while (initialMiles >= 0){
            System.out.println("Initial miles?");
            initialMiles = scan.nextDouble();
            if (initialMiles < 0){
                System.out.println("Bye");
            }
            else{
                System.out.println("Final miles?");
                finalMiles = scan.nextDouble();
                System.out.println("Gallons?");
                gallons = scan.nextDouble();

                milesGallon = (finalMiles - initialMiles)/gallons;

                System.out.println("Miles Per Gallon: " + milesGallon);
            }

        }

    }

}