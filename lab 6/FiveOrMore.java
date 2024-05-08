import java.util.*;
public class FiveOrMore{
    public static String reverse(String s){
        String rev = "";
        char c;

        for(int i = 0; i < s.length(); i++){
            c = s.charAt(i);
            rev = c+rev;
        }
        return rev;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        String[] a = s.split(" ");

        for(int i = 0; i < a.length; i++){
            if(a[i].length() >= 5){
                a[i] = reverse(a[i]);
            }
        }
        for(int i = 0; i < a.length; i++){
            System.out.print(a[i]+" ");
        }
    }
}
