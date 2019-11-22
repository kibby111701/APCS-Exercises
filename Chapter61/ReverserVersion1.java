import java.io.*;

public class ReverserVersion1{
    public static void main(String[] args) {
        int [] data = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};

        for (int i = 0; i < data.length/2; i++){
            int swapSpot = data.length - 1 - i;
            int temp = data[i];
            data[i] = data[swapSpot];
            data[swapSpot] = temp;

        }

        for (int i = 0; i < data.length; i++){
            System.out.println(data[i]);
        }

    }

}