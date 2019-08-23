public class Trigonometry{

    public static void main(String[] args) {
        double degrees = 30;
        double radValue = degrees * Math.PI/180;
        double sine = Math.sin(radValue);
        double cosine = Math.cos(radValue);
        double sum = (sine * sine)+(cosine * cosine);
        System.out.println("In radians the value is:" + radValue);
        System.out.println("In degrees the value is:" + degrees);
        System.out.println("sine: " + sine + " cosine: " + cosine + " sum of squares: " + sum );

    }


}