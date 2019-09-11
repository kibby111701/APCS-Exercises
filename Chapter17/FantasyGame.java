import java.util.Scanner;

public class FantasyGame{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int strength, health, luck;
        String name;

        System.out.println("Welcome to Crystal Sapphire Quest! Enter your name here:");
        name = scan.nextLine();
        System.out.println("Enter your strength");
        strength = scan.nextInt();
        System.out.println("Enter your health");
        health = scan.nextInt();
        System.out.println("Enter your luck");
        luck = scan.nextInt();

        if (strength + health + luck > 15){
            System.out.println("Your character has is too powerful! Default values have been assigned");
            strength = 5;
            health = 5;
            luck = 5;
        }

        System.out.println(name + " strength: " + strength + " , health: " + health + " , luck: " + luck);

    }

}