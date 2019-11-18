import java.util.Scanner;

public class Combinations{

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

    public static long combo(int nnum, int rnum){
        if (factorial(nnum) < 0 || factorial(rnum) < 0 || rnum > nnum){
            return -1;
        }
        else{
            long nfact = factorial(nnum);
            long rfact = factorial(rnum);
            long com = nfact / (rfact * factorial(nnum - rnum));
            return com;
        }
    }

    public static void main(String[] args) {
        int n, r;
        Scanner scan = new Scanner(System.in);
        long comb = 1;

        while (comb >= 0){
            System.out.println("Enter N");
            n = scan.nextInt();
            System.out.println("Enter R");
            r = scan.nextInt();

            comb = combo(n, r);
            System.out.println("The number of combinations is " + comb);
        }
    }

}