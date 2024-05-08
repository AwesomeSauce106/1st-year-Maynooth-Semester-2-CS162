import java.util.*;
public class SumDigits{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(recursiveSum(num));
    }
    public static int recursiveSum(int n){
        if(n == 0)return 0;
        else{
            return n%10 + recursiveSum(n/10);
        }
    }
}
