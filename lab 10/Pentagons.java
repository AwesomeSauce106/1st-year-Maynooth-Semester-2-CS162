import java.util.*;
public class Pentagons{
    public static int numDots(int n){
        if(n == 0){     // base case
            return 1;
        }
        // recursuve call
        return numDots(n-1) + (n-1)*5;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println(numDots(sc.nextInt()) + " dots");
        sc.close();
    }
}
