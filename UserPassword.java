import java.util.Scanner;

public class UserPassword{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        String username, password, subPassword;

        System.out.println("Enter a username");
        username = scan.nextLine();
        System.out.println("Enter a password");
        password = scan.nextLine();
        subPassword = password.substring(0, (password.length() - 2));


        if (username.equals("admin person") || username.equals("jimbob234") || username.equals("skater_gurl17") || username.equals("gary")){
            System.out.println("That username is taken");
        }
        else{
            System.out.println("Username accepted");
        }
        if (!password.startsWith("A") && !password.startsWith("E") && !password.startsWith("I") && !password.startsWith("O") && !password.startsWith("U")
            && !password.startsWith("a") && !password.startsWith("e") && !password.startsWith("i") && !password.startsWith("o") && !password.startsWith("u")){
            System.out.println("That password does not start with a vowel");
        }
        else if (!password.contains("#") && !password.contains("!") && !password.contains("$") && !password.contains("&") && !password.contains("*")){
            System.out.println("That password does not contain a special character");
        }
        else if (password.contains(username)){
            System.out.println("You can't have your username as part of your password");
        }
        else if (subPassword.contains("0") || subPassword.contains("1") || subPassword.contains("2") || subPassword.contains("3") || subPassword.contains("4") ||
            subPassword.contains("5") || subPassword.contains("6") || subPassword.contains("7") || subPassword.contains("8") || subPassword.contains("9")){
            System.out.println("Numbers can only be the last two characters in your password");
        }
        else {
            System.out.println("Password accepted");
        }
            
    }




}