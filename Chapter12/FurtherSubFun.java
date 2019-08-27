import java.util.Scanner;

public class FurtherSubFun {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String sentence, sub;
        int beginIndex, endIndex;

        System.out.println("Enter a string");
        sentence = scan.nextLine();
        System.out.println("Enter beginning index");
        beginIndex = scan.nextInt();
        System.out.println("Enter ending index");
        endIndex = scan.nextInt();

        sub = sentence.substring(beginIndex, endIndex);
        System.out.println("Original string: ");
        System.out.println(sentence);
        System.out.println("Substring: ");
        System.out.println(sub);


    }
}