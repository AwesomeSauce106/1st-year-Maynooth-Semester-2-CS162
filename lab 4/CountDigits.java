import java.util.*;
public class CountDigits{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int tot = 0;
        tot = countEights(str, str.length()-1, tot);
        System.out.println("Result = " + tot);
    }
    public static int countEights(String st, int l, int eights){
        // checks if char is 8
        if(st.charAt(l) == '8'){
            eights++;
            // checks if l is on the last digit
            if(l != 0){
                // checks if the next digit (to the left) is an int
                if(st.charAt(l-1) == '8'){
                    eights++;
                    return countEights(st, l-1, eights);
                }else{
                    return countEights(st, l-1, eights);
                }
            }
            // if l is at the end of string returns 8s
            else{
                return eights;
            }
        }
        // if l is not at end of string runs recursive
        else if(l != 0){
            return countEights(st, l-1, eights);
        }
        // base case
        else{
            return eights;
        }
    }
}
