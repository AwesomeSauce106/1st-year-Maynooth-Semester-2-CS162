import java.util.*;
public class MinimumValue{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] ar = new int[sc.nextInt()];   // defining list
        // filling list
        for(int i = 0; i < ar.length;i++){
            ar[i] = sc.nextInt();
        }

        System.out.println(minArrayIter(ar)+" "+minArrayRec(ar,ar.length));
    }

    public static int minArrayIter(int[] a){
        int min = Integer.MAX_VALUE;        // setting minimum to high value
        // loops through list
        for(int i = 0; i < a.length; i++){
            // setting minimum to smaller value
            if(min > a[i]){
                min = a[i];
            }
        }
        return min;     // returns minimum value
    }

    public static int minArrayRec(int[] a, int n){
        int min = Integer.MAX_VALUE;        // setting minimum to high value
        
        if(n == 1){     // break case returns the last value if n = 1
            return a[0];
        }else{
            // finds the two values of a list compares them and keeps the minimum
            return Math.min(a[n-1], minArrayRec(a,n-1));
        }
    }
}
