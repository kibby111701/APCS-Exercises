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
    Pantry bubby = new Pantry(goose, apple);
    Pantry frank = new Pantry(goose);
    
    System.out.println("Welcome to Mother Hubbard's Pantry!");
    System.out.println( hubbard );

    System.out.println("Welcome to Daddy Bubby's Pantry!");
    System.out.println(bubby);

    // System.out.println("Welcome to Filthy Frank's Pantry!");
    // System.out.println(frank);

    bubby.select(1);
    bubby.spread(10);

    bubby.select(2);
    bubby.spread(7);

    bubby.select(3);
    bubby.spread(2);

    bubby.replace(rhub, 3);
    bubby.select(3);
    bubby.spread(2);

    System.out.println(bubby);

    bubby.mixedFruit();

    System.out.println(bubby);

    // while (selection != -1){

    //   System.out.println("Enter your selection (1, 2, 3): ");
    //   selection = scan.nextInt();

    //   System.out.println("Enter amount to spread: ");
    //   amountChosen = scan.nextInt();

    //   hubbard.select(selection);
    //   hubbard.spread(amountChosen);

    //   System.out.println(hubbard);
    // }
    
  }
}