import java.util.*;

public class PasswordCracker{
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        String password, possibility;
        int char1, char2, char3, char4, char5, tryCount;

        System.out.println("Enter a password");
        password = scan.nextLine();
        possibility = "abcdefghijklmnopqrstuvwxyz ";

        tryCount = 0;

        while (!password.equals(char1 + char2 + char3 + char4 + char5){
            char1 = possibility.charAt(rand.nextInt(27));
            char2 = possibility.charAt(rand.nextInt(27));
            char3 = possibility.charAt(rand.nextInt(27));
        }

    }

}