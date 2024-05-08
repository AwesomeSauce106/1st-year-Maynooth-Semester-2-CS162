import java.util.*;
public class StringReverse{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        reverseString(str, str.length()-1);    
    }

    public static char reverseString(String st, int pos){
        if(pos == 0){
            System.out.println(st.charAt(pos));
            return st.charAt(pos);
        }else{
            System.out.print(st.charAt(pos));
            return reverseString(st, pos-1);
        }

    }
}
