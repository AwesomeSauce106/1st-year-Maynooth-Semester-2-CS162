import java.util.*;
public class AsciiDifference{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String one = sc.nextLine(), two = sc.nextLine();

        int dif = difference(one, two);

        System.out.println(dif);
    }
    public static int difference(String s, String s1){
        int i = asciiNum(s);
        int j = asciiNum(s1);

        return i-j;
    }
    public static int asciiNum(String s){
        int val = 0;
        for(int i = 0; i < s.length(); i++){
            val += (int) s.charAt(i);
        }
        return val;
    }
}
