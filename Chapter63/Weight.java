import java.util.Arrays;

public class Weight{
    private int[] data;

    public Weight(int[] init){
        data = new int[init.length];

        for (int i = 0; i < data.length; i++){
            data[i] = init[i];
        }
    }

    public int average(){
        int total = 0;
        for (int i = 0; i < data.length; i++){
            total += data[i];
        }
        return total/data.length;
    }

    public int subAverage(int start, int end){
        int total = 0;
        int dayCount = 0;
        for (int i = start; i < end + 1; i++){
            total += data[i];
            dayCount += 1;
        }
        return total/dayCount;
    }

    public String toString(){
        return Arrays.toString(data);
    }

}