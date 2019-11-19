import java.util.Arrays;

public class TwoArrays{
    public static void main(String[] args) {
        int[] val = {13, -4, 82, 17};
        int[] twice = new int[4];

        System.out.println("Original array: " + Arrays.toString(val));

        twice[0] = 2*val[0];
        twice[1] = 2*val[1];
        twice[2] = 2*val[2];
        twice[3] = 2*val[3];

        System.out.println("New array: " + Arrays.toString(twice));
    }


}