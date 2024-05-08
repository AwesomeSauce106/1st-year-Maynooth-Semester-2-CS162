import java.util.*;
public class MathsFunction{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(q1itterative(num) + " " + q1recursive(num));
    }

    public static int q1itterative(int n){
        if(n == 1){
            return 2;
        }else{
            int result = 0;
            int prevResult = 2;

            for(int i = 2; i<= n;i++){
                result = 4*prevResult - 3*i;
                prevResult = result;
            }
            return result;
        }
    }

    public static int q1recursive(int n){
        if(n == 1){
            return 2;
        }else{
            return 4*(q1recursive(n-1)) - 3*n;
        }
    }

}
