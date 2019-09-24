import java.util.Scanner;

public class BirthdayParadox{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double probability = 1;
        int numberGuests;

        System.out.println("How many guests?");
        numberGuests = scan.nextInt();

        for (int count = 1; count <= numberGuests; count ++){
            probability *= ((365-count)/365.0);

        }

        System.out.println(probability);

    }


}