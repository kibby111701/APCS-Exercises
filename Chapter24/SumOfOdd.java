import java.util.Scanner;

public class SumOfOdd{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n, startNumber, sum, nSquared;
        
        System.out.println("Enter N:");
        n = scan.nextInt();

        sum = 0;
        nSquared = n * n;
        
        for (startNumber = 1; startNumber <= n; startNumber = startNumber + 2){
            sum += startNumber;
        }
        System.out.println(sum);
        System.out.println(nSquared);
    }

}