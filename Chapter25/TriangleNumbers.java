import java.util.Scanner;

public class TriangleNumbers{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int upperLimit;

        System.out.println("Enter the upper limit");
        upperLimit = scan.nextInt();

        for (int i=0; (i*(i+1))/2<=upperLimit; i++){
            int triangleNumber = (i*(i+1))/2;
            for (int j=0; j<= i; j++){
                int squareNumber = j*j;
                if (triangleNumber == squareNumber){
                    System.out.println(triangleNumber);
                }
            }
            
        }

    }


}