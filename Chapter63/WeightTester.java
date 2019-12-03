import java.util.Arrays;

public class WeightTester{
    public static void main(String[] args) {
        int[] values = {98,99,98,99,100,101, 102, 100, 104, 105, 105, 106, 105, 103, 104,
            103, 105, 106, 107, 106, 105, 105, 104, 104, 103, 102, 102, 101, 100, 102};

        Weight june = new Weight(values);
        System.out.println(june);

        int average = june.average();
        System.out.println("Average: " + average);

        int firstHalf = june.subAverage(0, 14);
        int secondHalf = june.subAverage(15, 29);
        int fourDay = june.subAverage(8, 11);

        System.out.println("First half: " + firstHalf + " Second Half: " + secondHalf);

        System.out.println(fourDay);
    }
}