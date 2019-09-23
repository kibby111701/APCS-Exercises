public class SheepHerdSize{
    public static void main(String[] args) {
        double n, power;
        int t;

        power = 0.83;
        System.out.println("20");
        for (t = 1; t < 26; t++ ){        
           n = Math.round(220/(1+ (10 * power)));
           power *= 0.83;
           System.out.println(n); 
        }
        
    }


}