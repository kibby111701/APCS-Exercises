import java.util.Scanner;

public class SumOfDivisors{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sum = 0, n;

        System.out.println("Enter N");
        n = scan.nextInt();

        for (int count = 1; count < n; count ++){
            if (n % count == 0){
                sum += count;
            }
        }

        System.out.println(sum);

        if (sum == n){
            System.out.println(n + " is a perfect number");
        }


    }


}