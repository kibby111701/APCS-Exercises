import java.io.*;

class ThreeSums{
    public static void main(String[] args) {
        
        int[] data = {3,2,5,7,9,12,97,24,54};

        int allSum = 0;
        int oddSum = 0;
        int evenSum = 0;

        for (int i = 0; i < data.length; i++){
            allSum += data[i];
            if (data[i] % 2 == 0){
                evenSum += data[i];
            }
            else{
                oddSum += data[i];
            }
        }


        System.out.println(allSum + " " + oddSum + " " + evenSum);
    }


}