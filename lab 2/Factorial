import java.util.*;
public class Factorial{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        if(n<0 || m<0){
            System.out.println("Not Valid!");
        }else{
            getFactorial(n,m);
        }

    }

    public static void getFactorial(int num1, int num2){

        for(int i = num1; i<=num2;i++){
            int fact = 1;

            for(int j = 2; j<=i; j++){
                fact *= j;
            }
            System.out.println(fact);
        }
    }
}
