import java.util.*;
public class PrimePalindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int palin = palinFinder(num);

        System.out.println("The next prime palindrome is "+palin);
    }

    // palindrome finder
    public static int palinFinder(int num){
        if(num < 100){                      // if the number is less than 100
            for(int i=num;i<99;i++){        // loops numbers to find palindrome
                if(primeCheck(i) == true){  // checks if the number if prime
                    if(i/10 == i%10){       // checks if the number is a palindrome
                        return i;           // returns the number if its a palindrome
                    }
                }
            }
        }
        for(int i=num;i<999;i++){           // loops numbers to find palindrome
            if(primeCheck(i) == true){      // checks if the number if prime
                if(i/100 == i%10){          // checks if the number is a palindrome
                    return i;               // returns the number if its a palindrome
                }
            }
        }
        return 0;
    }

    // prime number checker
    public static boolean primeCheck(int numb){
        for(int j=2;j<numb;j++){        // loops to check if number is prime
            if(numb%j == 0){            // checks if number is prime
                return false;           // returns the number is not prime
            }
        }
        return true;                    // returns the number is prime
    }
}
