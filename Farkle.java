
import java.util.*;



public class Farkle{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int scoreOne, scoreTwo, workingSumOne, workingSumTwo, dieCount, dieOne, dieTwo, dieThree, dieFour, dieFive, dieSix;
        String continueOne, continueTwo;
        boolean farkle, threeOfAKind;

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

            while (!continueOne.equals("n") && !farkle && dieCount > 0){
                System.out.println("Player One, press 'y' to roll your remaining dice. Press 'n' to back out.");
                continueOne = scan.nextLine();
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

                    if (dieOne == 1 || dieOne == 5){
                        System.out.println("Keep Die 1? y/n");
                        keepOne = scan.nextLine();
                        if (keepOne.equals("y") && dieOne == 1){
                            workingSumOne += 100;
                            dieCount -= 1;
                        }
                        else if (keepOne.equals("y") && dieOne == 5){
                            workingSumOne += 50;
                            dieCount -= 1;
                        }
                        else{
                            workingSumOne += 0;
                        }
                    }

                    keepOne = "";

                    else if (dieTwo == 1 || dieTwo == 5){
                        System.out.println("Keep Die 2? y/n");
                        keepOne = scan.nextLine();
                        if (keepOne.equals("y") && dieTwo == 1){
                            workingSumOne += 100;
                            dieCount -= 1;
                        }
                        else if (keepOne.equals("y") && dieTwo == 5){
                            workingSumOne += 50;
                            dieCount -= 1;
                        }
                        else{
                            workingSumOne += 0;
                        }
                    }

                    keepOne = "";

                    else if (dieThree == 1 || dieThree == 5){
                        System.out.println("Keep Die 3? y/n");
                        keepOne = scan.nextLine();
                        if (keepOne.equals("y") && dieThree == 1){
                            workingSumOne += 100;
                            dieCount -= 1;
                        }
                        else if (keepOne.equals("y") && dieThree == 5){
                            workingSumOne += 50;
                            dieCount -= 1;
                        }
                        else{
                            workingSumOne += 0;
                        }
                    }

                    keepOne = "";

                    else if (dieFour == 1 || dieFour == 5){
                        System.out.println("Keep Die 4? y/n");
                        keepOne = scan.nextLine();
                        if (keepOne.equals("y") && dieFour == 1){
                            workingSumOne += 100;
                            dieCount -= 1;
                        }
                        else if (keepOne.equals("y") && dieFour == 5){
                            workingSumOne += 50;
                            dieCount -= 1;
                        }
                        else{
                            workingSumOne += 0;
                        }
                    }

                    keepOne = "";

                    else if (dieFive == 1 || dieFive == 5){
                        System.out.println("Keep Die 5? y/n");
                        keepOne = scan.nextLine();
                        if (keepOne.equals("y") && dieFive == 1){
                            workingSumOne += 100;
                            dieCount -= 1;
                        }
                        else if (keepOne.equals("y") && dieFive == 5){
                            workingSumOne += 50;
                            dieCount -= 1;
                        }
                        else{
                            workingSumOne += 0;
                        }
                    }

                    keepOne = "";

                    else if (dieSix == 1 || dieSix == 5){
                        System.out.println("Keep Die 6? y/n");
                        keepOne = scan.nextLine();
                        if (keepOne.equals("y") && dieSix == 1){
                            workingSumOne += 100;
                            dieCount -= 1;
                        }
                        else if (keepOne.equals("y") && dieSix == 5){
                            workingSumOne += 50;
                            dieCount -= 1;
                        }
                        else{
                            workingSumOne += 0;
                        }
                    }

                    keepOne = "";
                }
            }


        }
    }


}