import java.util.Arrays;

public class Weight{
    private int[] data;

    public Weight(int[] init){
        data = new int[init.length];

        for (int i = 0; i < data.length; i++){
            data[i] = init[i];
        }
    }

    public String toString(){
        return Arrays.toString(data);
    }

}