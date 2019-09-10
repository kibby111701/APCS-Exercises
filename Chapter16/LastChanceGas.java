import java.util.Scanner;

public class LastChanceGas{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tankCapacity, gageReading, milesPerGallon;

        System.out.println("Tank capacity:");
        tankCapacity = scan.nextInt();
        System.out.println("Gage reading:");
        gageReading = scan.nextInt();
        System.out.println("Miles per Gallon");
        milesPerGallon = scan.nextInt();

        if (((tankCapacity * (gageReading/100)) * milesPerGallon) < 200){
            System.out.println("Get gas!");
        }
        else{
            System.out.println("Safe to proceed");
        }
    }


}