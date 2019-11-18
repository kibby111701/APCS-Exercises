import java.util.Scanner;

public class Factorial{
    
    public static long factorial(int num){
        if (num < 0 || num > 20){
            return -1;
        }
        else{
            long fct = 1;
            for (int j = 1; j<=num; j++){
                fct *= j;
            }
            return fct;
        }
    }

    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        long fact = 1;



        while (fact >= 0){
            System.out.println("Enter N. Anything less than 0 or greater than 20 will result in a value returned of -1");
            n = scan.nextInt();
            
            fact = factorial(n);
            System.out.println("The factorial of " + n + " is " + fact);
        }
    }

}