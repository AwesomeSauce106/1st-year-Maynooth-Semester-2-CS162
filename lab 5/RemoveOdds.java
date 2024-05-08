import java.util.*;
public class RemoveOdds{
    public static int evenDigits(int i){
        if(i == 0){     // base case
            return 0;
        }
        if(i%2 == 1){       // if odd
            return evenDigits(i/10);
        }else{              // if even
            return i%10 + (evenDigits(i/10))*10;
        }
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);        // scanner
        int i = sc.nextInt();       // gets int to be manipulated
        System.out.println(evenDigits(i));      // runs recursive & prints answer
    }
}
