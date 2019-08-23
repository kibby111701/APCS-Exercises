public class QuadraticValue
{
    public static void main(String[] args) {
        double x;
        x = 4.0;
        double value;
        value = ((3 * x * x)-(8*x)+4);
        System.out.println("At X = " + x + " the value is " + value);

        x = 0.0;
        value = ((3 * x * x)-(8*x)+4);
        System.out.println("At X = " + x + " the value is " + value);

        x = 2.0;
        value = ((3 * x * x)-(8*x)+4);
        System.out.println("At X = " + x + " the value is " + value);
    }

}