import java.io.*;

public class NearlyZero{
    public static void main(String[] args) {
        int[] data = {3, 1, 5, 7, 4, 12, -3, 8, -2};

        int closestToZero = data[0];

        for (int i = 0; i < data.length; i++){
            if (Math.sqrt(data[i] * data[i]) < closestToZero){
                closestToZero = data[i];
            }
        }

        System.out.println(closestToZero);
    }

}