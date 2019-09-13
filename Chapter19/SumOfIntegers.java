import java.util.Scanner;

public class SumOfIntegers{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int loopCurrentValue, endValue, loopSum, formulaSum;

        System.out.println("Enter the ending value you want");
        endValue = scan.nextInt();

        loopSum = 0;
        formulaSum = 0;
        loopCurrentValue = 1;
        
        while (loopCurrentValue <= endValue){
            loopSum += loopCurrentValue;
            loopCurrentValue += 1;
        }
        
        formulaSum = (endValue * (endValue + 1))/2;

        System.out.println("Loop Sum = " + loopSum);
        System.out.println("Formula Sum = " + formulaSum);

    }


}