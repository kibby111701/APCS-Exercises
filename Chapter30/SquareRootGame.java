import java.util.*;

public class SquareRootGame{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        double randomNumber, playerOneGuess, playerTwoGuess, squareRoot;
        int roundCount, playerOneScore, playerTwoScore;

        playerOneScore = 0;
        playerTwoScore = 0;

        System.out.println("How many rounds?");
        roundCount = scan.nextInt();

        for (int i = 0; i < roundCount; i++){
            randomNumber = rand.nextDouble() * 100;
            squareRoot = Math.sqrt(randomNumber);

            System.out.println("What is the square root of " + randomNumber + "?");
            playerOneGuess = scan.nextDouble();
            playerTwoGuess = scan.nextDouble();

            System.out.println("It was " + squareRoot);

            if (Math.abs(playerOneGuess - squareRoot) < Math.abs(playerTwoGuess - squareRoot)){
                System.out.println("Player 1 wins!");
                playerOneScore +=1;
            }
            else{
                System.out.println("Player 2 wins!");
                playerTwoScore += 1;
            }
        }

        System.out.println("Final score: " + playerOneScore + " to " + playerTwoScore);


    }


}