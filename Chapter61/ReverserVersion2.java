import java.io.*;

public class ReverserVersion2{
    public static void main(String[] args){
        int[] data = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
        int[] result = new int[14];

        for (int i = 0; i < data.length ; i++){
            result[i] = data[data.length - 1 - i];
        }

        for (int i = 0; i < result.length; i++){
            System.out.println(result[i]);
        }

    }

}