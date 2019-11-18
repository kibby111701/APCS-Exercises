import java.util.Scanner;

public class OdiousTest{
    public static boolean odious(int num){
        int oneCount = 0;
        while (num > 0){
            if (num % 2 == 1){
                oneCount += 1;
            }
            num = num/2;
        }
        if (oneCount % 2 == 1){
            return true;
        }
        else{
            return false;
        }

    }

    public static void main(String[] args) {
        int n;
        boolean odi;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a negative value to exit");
        System.out.println("Enter N: ");
        n = scan.nextInt();

        while (n >= 0){
            odi = odious(n);
            if (odi){
                System.out.println(n + " is odious");
            }
            else{
                System.out.println(n + " is evil");
            }
            System.out.println("Enter N: ");
            n = scan.nextInt();
        }
    }



}