import java.util.Scanner;

public class WordsByDots{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstWord, secondWord, comboWord;
        int comboLength;

        System.out.println("Enter first word");
        firstWord = scan.nextLine();
        System.out.println("Enter second word");
        secondWord = scan.nextLine();

        comboWord = firstWord + secondWord;
        comboLength = comboWord.length();

        System.out.print(firstWord);
        while (comboLength < 30){
            System.out.print(".");
            comboLength += 1;
        }
        System.out.print(secondWord);
    }

}