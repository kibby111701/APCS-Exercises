import java.util.Scanner;

public class PantryTester
{
  public static void main ( String[] args )
  {

    Scanner scan = new Scanner(System.in);
    int selection = 0;
    int amountChosen;

    Jam goose = new Jam( "Gooseberry", "7/4/86", 12 );
    Jam apple = new Jam( "Crab Apple", "9/30/99", 8 );
    Jam rhub  = new Jam( "Rhubarb", "10/31/99", 3 );

    Pantry hubbard = new Pantry(goose, apple, rhub);
    // Pantry bubby = new Pantry(goose, apple);
    
    System.out.println("Welcome to Mother Hubbard's Pantry!");
    System.out.println( hubbard );

    System.out.println("Welcome to Daddy Bubby's Pantry!");
    System.out.println(bubby);

    while (selection != -1){

      System.out.println("Enter your selection (1, 2, 3): ");
      selection = scan.nextInt();

      System.out.println("Enter amount to spread: ");
      amountChosen = scan.nextInt();

      hubbard.select(selection);
      hubbard.spread(amountChosen);

      System.out.println(hubbard);
    }
    
  }
}