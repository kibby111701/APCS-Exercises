import java.util.*;

public class PigDiceGame{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int compScore, playerScore, dieRoll, workingSum, playerContinue;

        compScore = 0;
        playerScore = 0;

        while (playerScore < 100 && compScore < 100){
            compScore = compScore + (rand.nextInt(6) + 1) + (rand.nextInt(6) + 1) + (rand.nextInt(6) + 1);

            System.out.println("New computer score: " + compScore);
            workingSum = 0;
            dieRoll = 0;
            playerContinue = 0;
            

            while (dieRoll != 1 && playerContinue != 1){

                System.out.println("Press 1 to quit. Press any other number to continue");
                playerContinue = scan.nextInt();
                
                if (playerContinue != 1){
                    dieRoll = rand.nextInt(6) + 1;
                    System.out.println("Roll: " + dieRoll);
                    
                    if (dieRoll != 1){
                        workingSum += dieRoll;
                    }
                    else{
                        workingSum = 0;
                    }
                }

                System.out.println("Current working sum: " + workingSum);

            }
            playerScore += workingSum;
            System.out.println("New player score: " + playerScore);
        }

        if (playerScore > compScore){
            System.out.println("You won!");
        }
        else{
            System.out.println("You lost");
        }

    }


}