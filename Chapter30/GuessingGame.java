import java.util.*;

public class GuessingGame{
    public static void main(String[] args) {
        int tryCount, guessNumber, answerNumber;
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);

        answerNumber = rand.nextInt(10) + 1;
        guessNumber = 0;
        tryCount = 3;
        
        System.out.println("I am thinking of a number between 1 and 10. Guess it in three tries.");
        
        while (tryCount > 0 && guessNumber != answerNumber){
            guessNumber = scan.nextInt();

            if (guessNumber == answerNumber){
                System.out.println("Correct!");
            }
            else{
                System.out.println("Wrong");
                tryCount -= 1;
            }

        }

        if (guessNumber == answerNumber){
            System.out.println("You won!");
        }

        if (tryCount == 0){
            System.out.println("You lost");
            System.out.println("The correct number was " + answerNumber);
        }
    }

}