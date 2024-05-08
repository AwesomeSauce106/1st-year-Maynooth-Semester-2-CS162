import java.util.*;
public class Palindromes{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String palin = sc.nextLine();
        palin = palin.toLowerCase();
        boolean isBool = true;

        isBool  = isPalindrome(palin);
        
        if(isPalindrome(palin)){
            System.out.println(palin+" is a Palindrome");
        }else{
            System.out.println(palin+" is NOT a Palindrome");
        }
    }
    public static boolean isPalindrome(String str){

        for(int i = 0; i<(str.length()/2);i++){
            int len = str.length()-1;
            // checks if char(i) is equal to is corrosponding char at the end
            if(str.charAt(i) == str.charAt(len)){
                return true;
            }else{
                return false;
            }
        }
        return true;
    }
}
