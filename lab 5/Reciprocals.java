import java.util.*;
public class Reciprocals{
    public static double sumTo(int n){
        if(n == 1){
            return 1.0;
        }
        return 1.0/n + sumTo(n-1);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double result = sumTo(n);
        result = Math.round(result * 100.0) / 100.0;
        System.out.println(result);
    }
} 
