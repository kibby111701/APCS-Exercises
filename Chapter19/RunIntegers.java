import java.util.Scanner;

public class RunIntegers{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int startValue, endValue;

        System.out.println("Input the starting value you want");
        startValue = scan.nextInt();
        System.out.println("Input the ending value you want");
        endValue = scan.nextInt();

        while (startValue <= endValue){
            System.out.println(startValue);
            startValue += 1;
        }
    }


}