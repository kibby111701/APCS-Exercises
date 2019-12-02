import java.util.Arrays;

public class ArrayEquality{
    public static boolean myEquals(int[] a, int[] b){
        int trueCount; 
        if (a != null && b != null && a.length == b.length){
            trueCount = 0;
            for (int i =  0; i < a.length; i++){
                if (a[i] == b[i]){
                    trueCount += 1;
                }
                else{
                    trueCount += 0;
                }
            }
            if (trueCount == a.length){
                return true;
            }
            else{
                return false;
            }
        }
        else{
            return false;
        }
    }


    public static void main (String[] args){
        int[] arrayA = {1,2,3,4};
        int[] arrayB = {1,2,3,4};

        System.out.println("Arrays says: " + Arrays.equals(arrayA, null));
        System.out.println("My method says: " + myEquals(arrayA, null));
    }

}