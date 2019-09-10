import java.util.Scanner;
import java.lang.Math;

public class WindChillIndex{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double windSpeed, temperature, windChill;

        System.out.println("Wind Speed:");
        windSpeed = scan.nextDouble();
        System.out.println("Temperature:");
        temperature = scan.nextDouble();

        if (windSpeed < 3 || temperature > 50){
            windChill = temperature;
        }
        else{
            windChill = 35.74 + (0.6215*temperature)- (35.75 * Math.pow(windSpeed, 0.16)) + (0.4275*temperature*Math.pow(windSpeed, 0.16)); 
        }

        System.out.println("Wind chill: " + windChill);


    }

}