import java.util.Scanner;
import java.time.LocalDateTime;

public class TimeUntil{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int currentHour = LocalDateTime.now().getHour();
        int currentMinute = LocalDateTime.now().getMinute();
        int currentSecond = LocalDateTime.now().getSecond();
        int futureHour, futureMinute, futureSecond;
        int hourDiff, minuteDiff, secondDiff;
        String futureTime;

        System.out.println(currentHour);
        System.out.println(currentMinute);
        System.out.println(currentSecond);

        System.out.println("Enter the future hour");
        futureHour = scan.nextInt();
        System.out.println("Enter the future minute");
        futureMinute = scan.nextInt();
        System.out.println("Enter the future second");
        futureSecond = scan.nextInt();

        hourDiff = futureHour - currentHour;
        minuteDiff = futureMinute - currentMinute;
        secondDiff = futureSecond - currentSecond;
        
        if (hourDiff < 0){
            hourDiff += 12;
        }

        if (minuteDiff < 0){
            minuteDiff+=60;
            hourDiff -= 1;
            if (hourDiff < 0){
                hourDiff += 12;
            }
        }

        if (secondDiff < 0){
            secondDiff+= 60;
            minuteDiff -= 1;
            if (minuteDiff < 0){
                minuteDiff+=60;
                hourDiff -= 1;
                if (hourDiff < 0){
                    hourDiff += 12;
                }
            }

        }

        System.out.println("The difference is:" + hourDiff + ":" + minuteDiff + ":" + secondDiff);

        // if (hourDiff = 0){
        //     if (minuteDiff = 0){
        //         if (secondDiff = 0){
        //             System.out.println( "These are the same time");
        //         }
        //         else{
        //             System.out.println(secondDiff + " seconds");
        //         }
        //     else if (secondDiff = 0){
        //         System.out.println(minuteDiff + " minutes");
        //     }
        //     else {
        //         System.out.println(minuteDiff + " minutes and " secondDiff + " seconds");
        //     }


        //     }
        // }


    }


}