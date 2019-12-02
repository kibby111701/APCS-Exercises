import java.io.*;
import java.util.Scanner;

public class CoffeeAverage{
    public static void main (String[] args){

        Scanner scan = new Scanner(System.in);
        double total, average;

        double[] data = new double[13];

        for (int i = 0; i < data.length; i++){
            data[i] = scan.nextDouble();
            System.out.println(data[i]);
        }

        total = 0;

        for (int i = 0; i < data.length; i++){
            total += data[i]; 
        }

        average = total/data.length;
        System.out.println("Average: " + average);
        double farFromAverage = average;

        for (int i = 0; i < data.length; i++){
            double difference = Math.abs(data[i] - average);
            if (difference > Math.abs(farFromAverage - average)){
                farFromAverage = data[i];
            }
        }

        System.out.println("Farthest from the average: " + farFromAverage);

        total = 0;
        for (int i = 0; i < data.length; i++){
            if (data[i] == farFromAverage){
                total += 0;
            }
            else{
                total += data[i];
            }
        }

        average = total/(data.length-1);

        System.out.println("New average: " + average);


    }
}