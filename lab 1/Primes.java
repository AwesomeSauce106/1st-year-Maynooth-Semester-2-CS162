import java.util.*;
public class Primes{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int primer = sc.nextInt();

        if(isPrime(primer)){
            System.out.println(primer+" is a Prime number");
        }else{
            System.out.println(primer+" is NOT a Prime number");
        }
    }

    public static boolean isPrime(int num){
        for(int i=2;i<=num/2;i++){
            if(num%i == 0){
                return false;
            }
        }
        return true;
    }
}
