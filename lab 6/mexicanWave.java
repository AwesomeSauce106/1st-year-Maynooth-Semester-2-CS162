import java.util.*;
public class mexicanWave{
    public static String[] wave(String s){
        String[] a = new String[s.length()];
        for(int i = 0; i < s.length(); i++){
            a[i] = s.substring(0,i) + s.substring(i,i+1).toUpperCase() + s.substring(i+1);
        }
        return a;
    }
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        String[] ar = new String[st.length()];

        ar = wave(st.toLowerCase()); 

        for(int i = 0; i < ar.length; i++){
            System.out.println(ar[i]);
        }
    }
}
