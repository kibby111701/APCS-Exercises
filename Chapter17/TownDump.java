import java.util.Scanner;

public class TownDump{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int dumpAmount, dumpPrice;

        System.out.println("What is the weight of the trash you are dumping?");
        dumpAmount = scan.nextInt();

        dumpPrice = 20;

        if (dumpAmount > 200){
            dumpPrice += 8 * ((dumpAmount - 100)/100);
        }

        System.out.println("The cost to dump that amount of trash is " + dumpPrice + " dollars.");


    }


}