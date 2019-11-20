import java.util.Arrays;

public class ReverseOrder{
    public static void main(String[] args) {
        int[] val = {0, 1, 2, 3};
        int temp;

        System.out.println(Arrays.toString(val));

        for (int i = 0; i < val.length/2; i++){
            int swapSpot = val.length -1 - i;
            temp = val[i];
            val[i] = val[swapSpot];
            val[swapSpot] = temp;
        }

        System.out.println(Arrays.toString(val));

    }


}