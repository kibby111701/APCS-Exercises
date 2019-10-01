import java.util.*;

public class PasswordCracker{
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        String password, possibility, guessPassword; 
        int tryCount;

        System.out.println("Enter a password");
        password = scan.nextLine();
        possibility = "abcdefghijklmnopqrstuvwxyz";

        tryCount = 0;
        int letterCounter = 0;
        guessPassword = "";

        while (!password.equals(guessPassword)){
            guessPassword = "";
            letterCounter = 0;
            while (letterCounter < password.length()){
                guessPassword = guessPassword + possibility.charAt(rand.nextInt(possibility.length()));
                letterCounter +=1;
            }
            
            System.out.println(tryCount);
            tryCount += 1;
        }

        System.out.println("The password is " +guessPassword);
        System.out.println("It took " + tryCount + " tries");
    }

}