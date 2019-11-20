import java.util.Arrays;

public class SameSum{
    public static void main(String[] args) {
        int[] valA = {13, -22, 82, 17};
        int[] valB = {0, 0, 0, 0};
        int[] sum = {0, 0, 0, 0};
        
        for (int i = 0; i < 4; i++){
            valB[i] = 25 - valA[i];
            sum[i] = valA[i] + valB[i];
        }

        System.out.println("valA: " + Arrays.toString(valA));
        System.out.println("valB: " + Arrays.toString(valB));
        System.out.println("sum: " + Arrays.toString(sum));

    }

}