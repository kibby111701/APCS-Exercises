import java.util.Scanner;

public class AgeInSeconds{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int yearsAge, monthsAge, daysAge, totalDays, totalHours, totalMinutes, totalSeconds;
        double agePercentage;

        System.out.println("Enter the number of years you have been alive");
        yearsAge = scan.nextInt();
        totalDays = yearsAge * 365;

        System.out.println("Enter the number of months you have been alive this year");
        monthsAge = scan.nextInt();
        if (monthsAge == 0 || monthsAge > 11){
            totalDays += 0;
        }
        else if (monthsAge == 1){
            totalDays += 31;
        }
        else if (monthsAge == 2) {
            totalDays += 59;
        }
        else if (monthsAge == 3) {
            totalDays += 90;
        }
        else if (monthsAge == 4) {
            totalDays += 120;
        }
        else if (monthsAge == 5) {
            totalDays += 151;
        }
        else if (monthsAge == 6){
            totalDays += 181;
        }
        else if (monthsAge == 7){
            totalDays += 212;
        }
        else if (monthsAge == 8){
            totalDays += 243;
        }
        else if (monthsAge == 9){
            totalDays += 273;
        }
        else if (monthsAge == 10){
            totalDays += 304;
        }
        else if (monthsAge == 11){
            totalDays += 334;
        }

        System.out.println("Enter the number of days you have been alive this month");
        daysAge = scan.nextInt();

        totalDays+=daysAge;

        totalHours = totalDays * 24;
        totalMinutes = totalHours * 60;
        totalSeconds = totalMinutes * 60;

        agePercentage = (totalSeconds/2500000000.0) * 100;

        System.out.println("Your age in seconds is " + totalSeconds);
        System.out.println("That is " + agePercentage + " percent of the average lifespan");


    }


}