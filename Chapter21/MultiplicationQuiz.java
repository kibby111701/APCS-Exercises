import java.util.Scanner;
import java.util.Random;

public class MultiplicationQuiz{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numberOne, numberTwo, userAnswer, questionCount, numberRight;
        Random rand = new Random();

        questionCount = 1;
        numberRight = 0;

        while (questionCount<=10){
            numberOne = rand.nextInt(10) + 1;
            numberTwo = rand.nextInt(10) + 1;
            System.out.println("What is " + numberOne + " times " + numberTwo + "?");
            userAnswer = scan.nextInt();

            if (userAnswer == numberOne * numberTwo){
                System.out.println("Correct");
                numberRight += 1;
            }
            else{
                System.out.println("Incorrect");
            }

            questionCount += 1;

        }

        System.out.println("You got " + numberRight + " correct out of 10");

    }

}