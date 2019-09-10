import java.util.Scanner;

public class PieEatingContest{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int contestantWeight;

        System.out.println("How much do you weigh?");
        contestantWeight = scan.nextInt();

        if (contestantWeight - 250 < -30 || contestantWeight - 250 > 30){
            System.out.println("You can't compete");
        }
        else{
            System.out.println("You can compete");
        }


    }


}