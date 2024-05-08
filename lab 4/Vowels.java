import java.util.*;
public class Vowels{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toLowerCase();
        int tot = 0;
        tot = vowelCount(str);
        System.out.println(tot);
    }

    public static int vowelCount(String st){
        // checks char
        if(st.isEmpty()){
            return 0;
        }
        char ch = st.charAt(st.length()-1);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return 1 + vowelCount( st.substring( 0, st.length()-1 ) );
        }else{      // base case
            return 0 + vowelCount( st.substring( 0, st.length()-1 ) );
        }
    }
}
