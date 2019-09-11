import java.util.Scanner;

public class InternetDelicate{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String item;
        double price, deliveryCost;
        int overnightDelivery;

        System.out.println("Enter the item");
        item = scan.nextLine();
        System.out.println("Enter the price");
        price = scan.nextDouble();
        System.out.println("Overnight delivery? (0 == no, 1 == yes");
        overnightDelivery = scan.nextInt();


        if (price < 10){
            deliveryCost = 2.00;
        }
        else{
            deliveryCost = 0;
        }

        if (overnightDelivery == 1){
            deliveryCost += 3.00;
        }

        System.out.println("Invoice:");
        System.out.println(item + " " + price);
        System.out.println("delivery " + deliveryCost);
        System.out.println("total " + (price + deliveryCost));



    }



}