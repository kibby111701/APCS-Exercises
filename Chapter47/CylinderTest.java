import java.util.Scanner;

public class CylinderTest{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double radius, height;

        System.out.println("Enter the radius");
        radius = scan.nextDouble();

        System.out.println("Enter the height");
        height = scan.nextDouble();

        Cylinder cylinder = new Cylinder(radius, height);

        System.out.println(cylinder);
    }


}