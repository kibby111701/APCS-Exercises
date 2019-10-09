import java.util.*;

public class Farkle{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int scoreOne, scoreTwo, workingSumOne, workingSumTwo, dieCount, dieOne, dieTwo, dieThree, dieFour, dieFive, dieSix, removeTimes;
        String continueOne, continueTwo, keepOne, keepTwo;
        boolean farkle;

        scoreOne = 0;
        scoreTwo = 0;


        while (scoreOne < 10000 && scoreTwo < 10000){
            continueOne = "";
            keepOne = "";
            continueTwo = "";
            keepTwo = "";
            workingSumOne = 0;
            workingSumTwo = 0;
            dieCount = 6;
            removeTimes = 0;
            farkle = false;


            while (!continueOne.equals("n") && farkle == false && dieCount > 0){
                System.out.println("Player One, press 'y' to roll your remaining dice. Press 'n' to back out.");
                continueOne = scan.nextLine();

                if (continueOne.equals("y") && farkle == false && dieCount>0){ 
                    while (dieCount == 6){
                        dieOne = rand.nextInt(6) + 1;
                        dieTwo = rand.nextInt(6) + 1;
                        dieThree = rand.nextInt(6) + 1;
                        dieFour = rand.nextInt(6) + 1;
                        dieFive = rand.nextInt(6) + 1;
                        dieSix = rand.nextInt(6) + 1;

                        System.out.println("Die 1:" + dieOne);
                        System.out.println("Die 2:" + dieTwo);
                        System.out.println("Die 3:" + dieThree);
                        System.out.println("Die 4:" + dieFour);
                        System.out.println("Die 5:" + dieFive);
                        System.out.println("Die 6:" + dieSix);

                        if (threeOfKind(dieCount, dieOne, dieTwo, dieThree, dieFour, dieFive, dieSix) != -1){
                            System.out.println("You have a three of a kind!");
                            workingSumOne += (threeOfKind(dieCount, dieOne, dieTwo, dieThree, dieFour, dieFive, dieSix));
                            removeTimes += 3;
                        }

                        if (dieOne == 1 || dieOne == 5){
                            System.out.println("Keep Die 1? y/n");
                            keepOne = scan.nextLine();
                            if (keepOne.equals("y") && dieOne == 1){
                                workingSumOne += 100;
                                removeTimes += 1;
                            }
                            else if (keepOne.equals("y") && dieOne == 5){
                                workingSumOne += 50;
                                removeTimes += 1;
                            }
                            else{
                                workingSumOne += 0;
                            }
                        }


                        if (dieTwo == 1 || dieTwo == 5){
                            System.out.println("Keep Die 2? y/n");
                            keepOne = scan.nextLine();
                            if (keepOne.equals("y") && dieTwo == 1){
                                workingSumOne += 100;
                                removeTimes += 1;
                            }
                            else if (keepOne.equals("y") && dieTwo == 5){
                                workingSumOne += 50;
                                removeTimes += 1;
                            }
                            else{
                                workingSumOne += 0;
                            }
                        }

                        if (dieThree == 1 || dieThree == 5){
                            System.out.println("Keep Die 3? y/n");
                            keepOne = scan.nextLine();
                            if (keepOne.equals("y") && dieThree == 1){
                                workingSumOne += 100;
                                removeTimes += 1;
                            }
                            else if (keepOne.equals("y") && dieThree == 5){
                                workingSumOne += 50;
                                removeTimes += 1;
                            }
                            else{
                                workingSumOne += 0;
                            }
                        }

                        

                        if (dieFour == 1 || dieFour == 5){
                            System.out.println("Keep Die 4? y/n");
                            keepOne = scan.nextLine();
                            if (keepOne.equals("y") && dieFour == 1){
                                workingSumOne += 100;
                                removeTimes += 1;
                            }
                            else if (keepOne.equals("y") && dieFour == 5){
                                workingSumOne += 50;
                                removeTimes += 1;
                            }
                            else{
                                workingSumOne += 0;
                            }
                        }

                        

                        if (dieFive == 1 || dieFive == 5){
                            System.out.println("Keep Die 5? y/n");
                            keepOne = scan.nextLine();
                            if (keepOne.equals("y") && dieFive == 1){
                                workingSumOne += 100;
                                removeTimes += 1;
                            }
                            else if (keepOne.equals("y") && dieFive == 5){
                                workingSumOne += 50;
                                removeTimes += 1;
                            }
                            else{
                                workingSumOne += 0;
                            }
                        }

                        

                        if (dieSix == 1 || dieSix == 5){
                            System.out.println("Keep Die 6? y/n");
                            keepOne = scan.nextLine();
                            if (keepOne.equals("y") && dieSix == 1){
                                workingSumOne += 100;
                                removeTimes += 1;
                            }
                            else if (keepOne.equals("y") && dieSix == 5){
                                workingSumOne += 50;
                                removeTimes += 1;
                            }
                            else{
                                workingSumOne += 0;
                            }
                        }

                        

                        if ((dieOne != 1 && dieOne != 5) && (dieTwo != 1 && dieTwo != 5) && (dieThree != 1 && dieThree != 5) && (dieFour != 1 && dieFour != 5) && (dieFive != 1 && dieFive != 5) && (dieSix != 1 && dieSix != 5) && threeOfKind(dieCount, dieOne, dieTwo, dieThree, dieFour, dieFive, dieSix) == -1) {
                            System.out.println("Farkle!");
                            workingSumOne = 0;
                            farkle = true;
                        }

                        dieCount -= removeTimes;
                    }
                }

                System.out.println("Current sum: " + workingSumOne);
                removeTimes = 0;

                System.out.println("Keep rolling? y/n");
                continueOne = scan.nextLine();

                if (continueOne.equals("y") && farkle == false && dieCount>0){
                    while (dieCount == 5){
                        dieOne = rand.nextInt(6) + 1;
                        dieTwo = rand.nextInt(6) + 1;
                        dieThree = rand.nextInt(6) + 1;
                        dieFour = rand.nextInt(6) + 1;
                        dieFive = rand.nextInt(6) + 1;
                        dieSix = 0;

                        System.out.println("Die 1:" + dieOne);
                        System.out.println("Die 2:" + dieTwo);
                        System.out.println("Die 3:" + dieThree);
                        System.out.println("Die 4:" + dieFour);
                        System.out.println("Die 5:" + dieFive);

                        if (threeOfKind(dieCount, dieOne, dieTwo, dieThree, dieFour, dieFive, dieSix) != -1){
                            System.out.println("You have a three of a kind!");
                            workingSumOne += (threeOfKind(dieCount, dieOne, dieTwo, dieThree, dieFour, dieFive, dieSix));
                            removeTimes += 3;
                        }

                        if (dieOne == 1 || dieOne == 5){
                            System.out.println("Keep Die 1? y/n");
                            keepOne = scan.nextLine();
                            if (keepOne.equals("y") && dieOne == 1){
                                workingSumOne += 100;
                                removeTimes += 1;
                            }
                            else if (keepOne.equals("y") && dieOne == 5){
                                workingSumOne += 50;
                                removeTimes += 1;
                            }
                            else{
                                workingSumOne += 0;
                            }
                        }

                        

                        if (dieTwo == 1 || dieTwo == 5){
                            System.out.println("Keep Die 2? y/n");
                            keepOne = scan.nextLine();
                            if (keepOne.equals("y") && dieTwo == 1){
                                workingSumOne += 100;
                                removeTimes += 1;
                            }
                            else if (keepOne.equals("y") && dieTwo == 5){
                                workingSumOne += 50;
                                removeTimes += 1;
                            }
                            else{
                                workingSumOne += 0;
                            }
                        }

                        

                        if (dieThree == 1 || dieThree == 5){
                            System.out.println("Keep Die 3? y/n");
                            keepOne = scan.nextLine();
                            if (keepOne.equals("y") && dieThree == 1){
                                workingSumOne += 100;
                                removeTimes += 1;
                            }
                            else if (keepOne.equals("y") && dieThree == 5){
                                workingSumOne += 50;
                                removeTimes += 1;
                            }
                            else{
                                workingSumOne += 0;
                            }
                        }

                        

                        if (dieFour == 1 || dieFour == 5){
                            System.out.println("Keep Die 4? y/n");
                            keepOne = scan.nextLine();
                            if (keepOne.equals("y") && dieFour == 1){
                                workingSumOne += 100;
                                removeTimes += 1;
                            }
                            else if (keepOne.equals("y") && dieFour == 5){
                                workingSumOne += 50;
                                removeTimes += 1;
                            }
                            else{
                                workingSumOne += 0;
                            }
                        }

                        

                        if (dieFive == 1 || dieFive == 5){
                            System.out.println("Keep Die 5? y/n");
                            keepOne = scan.nextLine();
                            if (keepOne.equals("y") && dieFive == 1){
                                workingSumOne += 100;
                                removeTimes += 1;
                            }
                            else if (keepOne.equals("y") && dieFive == 5){
                                workingSumOne += 50;
                                removeTimes += 1;
                            }
                            else{
                                workingSumOne += 0;
                            }
                        }

                        if ((dieOne != 1 && dieOne != 5) && (dieTwo != 1 && dieTwo != 5) && (dieThree != 1 && dieThree != 5) && (dieFour != 1 && dieFour != 5) && (dieFive != 1 && dieFive != 5) && threeOfKind(dieCount, dieOne, dieTwo, dieThree, dieFour, dieFive, dieSix) == -1) {
                            System.out.println("Farkle!");
                            workingSumOne = 0;
                            farkle = true;
                        }

                        dieCount -= removeTimes;
                        
                    }

                }


                System.out.println("Current sum: " + workingSumOne);
                removeTimes = 0;

                System.out.println("Keep rolling? y/n");
                continueOne = scan.nextLine();
                
                if (continueOne.equals("y") && farkle == false && dieCount > 0){
                    while (dieCount == 4){
                        dieOne = rand.nextInt(6) + 1;
                        dieTwo = rand.nextInt(6) + 1;
                        dieThree = rand.nextInt(6) + 1;
                        dieFour = rand.nextInt(6) + 1;
                        dieFive = 0;
                        dieSix = 0;

                        System.out.println("Die 1:" + dieOne);
                        System.out.println("Die 2:" + dieTwo);
                        System.out.println("Die 3:" + dieThree);
                        System.out.println("Die 4:" + dieFour);

                        if (threeOfKind(dieCount, dieOne, dieTwo, dieThree, dieFour, dieFive, dieSix) != -1){
                            System.out.println("You have a three of a kind!");
                            workingSumOne += (threeOfKind(dieCount, dieOne, dieTwo, dieThree, dieFour, dieFive, dieSix));
                            removeTimes += 3;
                        }

                        if (dieOne == 1 || dieOne == 5){
                            System.out.println("Keep Die 1? y/n");
                            keepOne = scan.nextLine();
                            if (keepOne.equals("y") && dieOne == 1){
                                workingSumOne += 100;
                                removeTimes += 1;
                            }
                            else if (keepOne.equals("y") && dieOne == 5){
                                workingSumOne += 50;
                                removeTimes += 1;
                            }
                            else{
                                workingSumOne += 0;
                            }
                        }

                        

                        if (dieTwo == 1 || dieTwo == 5){
                            System.out.println("Keep Die 2? y/n");
                            keepOne = scan.nextLine();
                            if (keepOne.equals("y") && dieTwo == 1){
                                workingSumOne += 100;
                                removeTimes += 1;
                            }
                            else if (keepOne.equals("y") && dieTwo == 5){
                                workingSumOne += 50;
                                removeTimes += 1;
                            }
                            else{
                                workingSumOne += 0;
                            }
                        }

                        

                        if (dieThree == 1 || dieThree == 5){
                            System.out.println("Keep Die 3? y/n");
                            keepOne = scan.nextLine();
                            if (keepOne.equals("y") && dieThree == 1){
                                workingSumOne += 100;
                                removeTimes += 1;
                            }
                            else if (keepOne.equals("y") && dieThree == 5){
                                workingSumOne += 50;
                                removeTimes += 1;
                            }
                            else{
                                workingSumOne += 0;
                            }
                        }

                        

                        if (dieFour == 1 || dieFour == 5){
                            System.out.println("Keep Die 4? y/n");
                            keepOne = scan.nextLine();
                            if (keepOne.equals("y") && dieFour == 1){
                                workingSumOne += 100;
                                removeTimes += 1;
                            }
                            else if (keepOne.equals("y") && dieFour == 5){
                                workingSumOne += 50;
                                removeTimes += 1;
                            }
                            else{
                                workingSumOne += 0;
                            }
                        }

                        if ((dieOne != 1 && dieOne != 5) && (dieTwo != 1 && dieTwo != 5) && (dieThree != 1 && dieThree != 5) && (dieFour != 1 && dieFour != 5) && threeOfKind(dieCount, dieOne, dieTwo, dieThree, dieFour, dieFive, dieSix) == -1){
                            System.out.println("Farkle!");
                            workingSumOne = 0;
                            farkle = true;
                        }

                        dieCount -= removeTimes;
                    }
                }


                System.out.println("Current sum: " + workingSumOne);
                removeTimes = 0;

                System.out.println("Keep rolling? y/n");
                continueOne = scan.nextLine();
                
                if (continueOne.equals("y") && farkle == false && dieCount > 0){
                    while (dieCount == 3){
                        dieOne = rand.nextInt(6) + 1;
                        dieTwo = rand.nextInt(6) + 1;
                        dieThree = rand.nextInt(6) + 1;
                        dieFour = 0;
                        dieFive = 0;
                        dieSix = 0;

                        System.out.println("Die 1:" + dieOne);
                        System.out.println("Die 2:" + dieTwo);
                        System.out.println("Die 3:" + dieThree);

                        if (threeOfKind(dieCount, dieOne, dieTwo, dieThree, dieFour, dieFive, dieSix) != -1){
                            System.out.println("You have a three of a kind!");
                            workingSumOne += (threeOfKind(dieCount, dieOne, dieTwo, dieThree, dieFour, dieFive, dieSix));
                            removeTimes += 3;
                        }

                        if (dieOne == 1 || dieOne == 5){
                            System.out.println("Keep Die 1? y/n");
                            keepOne = scan.nextLine();
                            if (keepOne.equals("y") && dieOne == 1){
                                workingSumOne += 100;
                                removeTimes += 1;
                            }
                            else if (keepOne.equals("y") && dieOne == 5){
                                workingSumOne += 50;
                                removeTimes += 1;
                            }
                            else{
                                workingSumOne += 0;
                            }
                        }

                        if (dieTwo == 1 || dieTwo == 5){
                            System.out.println("Keep Die 2? y/n");
                            keepOne = scan.nextLine();
                            if (keepOne.equals("y") && dieTwo == 1){
                                workingSumOne += 100;
                                removeTimes += 1;
                            }
                            else if (keepOne.equals("y") && dieTwo == 5){
                                workingSumOne += 50;
                                removeTimes += 1;
                            }
                            else{
                                workingSumOne += 0;
                            }
                        }

                        if (dieThree == 1 || dieThree == 5){
                            System.out.println("Keep Die 3? y/n");
                            keepOne = scan.nextLine();
                            if (keepOne.equals("y") && dieThree == 1){
                                workingSumOne += 100;
                                removeTimes += 1;
                            }
                            else if (keepOne.equals("y") && dieThree == 5){
                                workingSumOne += 50;
                                removeTimes += 1;
                            }
                            else{
                                workingSumOne += 0;
                            }
                        }

                        if ((dieOne != 1 && dieOne != 5) && (dieTwo != 1 && dieTwo != 5) && (dieThree != 1 && dieThree != 5) && threeOfKind(dieCount, dieOne, dieTwo, dieThree, dieFour, dieFive, dieSix) == -1){
                            System.out.println("Farkle!");
                            workingSumOne = 0;
                            farkle = true;
                        }

                        dieCount -= removeTimes;

                    }
                
                }


                System.out.println("Current sum: " + workingSumOne);
                removeTimes = 0;

                System.out.println("Keep rolling? y/n");
                continueOne = scan.nextLine();

                if (continueOne.equals("y")){
                    while (dieCount == 2){
                        dieOne = rand.nextInt(6) + 1;
                        dieTwo = rand.nextInt(6) + 1;

                        System.out.println("Die 1:" + dieOne);
                        System.out.println("Die 2:" + dieTwo);

                        if (dieOne == 1 || dieOne == 5){
                            System.out.println("Keep Die 1? y/n");
                            keepOne = scan.nextLine();
                            if (keepOne.equals("y") && dieOne == 1){
                                workingSumOne += 100;
                                removeTimes += 1;
                            }
                            else if (keepOne.equals("y") && dieOne == 5){
                                workingSumOne += 50;
                                removeTimes += 1;
                            }
                            else{
                                workingSumOne += 0;
                            }
                        }

                        if (dieTwo == 1 || dieTwo == 5){
                            System.out.println("Keep Die 2? y/n");
                            keepOne = scan.nextLine();
                            if (keepOne.equals("y") && dieTwo == 1){
                                workingSumOne += 100;
                                removeTimes += 1;
                            }
                            else if (keepOne.equals("y") && dieTwo == 5){
                                workingSumOne += 50;
                                removeTimes += 1;
                            }
                            else{
                                workingSumOne += 0;
                            }
                        }


                        if ((dieOne != 1 && dieOne != 5) && (dieTwo != 1 && dieTwo != 5)){
                            System.out.println("Farkle!");
                            workingSumOne = 0;
                            farkle = true;
                        }

                        dieCount -= removeTimes;

                    }
                }

                System.out.println("Current sum: " + workingSumOne);
                removeTimes = 0;

                System.out.println("Keep rolling? y/n");
                continueOne = scan.nextLine();

                if (continueOne.equals("y")){
                    while (dieCount == 1){
                        dieOne = rand.nextInt(6) + 1;

                        System.out.println("Die 1:" + dieOne);

                        if (dieOne == 1 || dieOne == 5){
                            System.out.println("Keep Die 1? y/n");
                            keepOne = scan.nextLine();
                            if (keepOne.equals("y") && dieOne == 1){
                                workingSumOne += 100;
                                removeTimes += 1;
                            }
                            else if (keepOne.equals("y") && dieOne == 5){
                                workingSumOne += 50;
                                removeTimes += 1;
                            }
                            else{
                                workingSumOne += 0;
                            }
                        }

                        else{
                            System.out.println("Farkle!");
                            workingSumOne = 0;
                            farkle = true;
                        }

                        dieCount -= removeTimes;

                    }

                    System.out.println("Current sum: " + workingSumOne);
                }

            }
            System.out.println("Got out");
            scoreOne += workingSumOne;
            System.out.println("Player 1 score: " + scoreOne);

            farkle = false;

        }


    }

    public static int threeOfKind(int dieCount, int dieOne, int dieTwo, int dieThree, int dieFour, int dieFive, int dieSix){
        int numEqual = 0;

        for (int i = 1; i < dieCount; i++){
            if (dieOne == i){
                numEqual ++;
            }
            if (dieTwo == i){
                numEqual ++;
            }
            if (dieThree == i){
                numEqual ++;
            }
            if (dieFour == i){
                numEqual ++;
            }
            if (dieFive == i){
                numEqual ++;
            }
            if (dieSix == i){
                numEqual ++;
            }

            if (numEqual >= 3){
                if (i == 1){
                    return 1000;
                }
                else if (i == 2){
                    return 200;
                }
                else if (i == 3){
                    return 300;
                }
                else if (i == 4){
                    return 400;
                }
                else if (i == 5){
                    return 500;
                }
                else{
                    return 600;
                }
            }

            numEqual = 0;

        }

        return -1;
    }

}