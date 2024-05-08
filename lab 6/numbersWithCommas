import java.util.*;
public class numbersWithCommas{
    public static String commaNumbers(String s){
        if(s.length() < 4){
            return s;
        }
        return commaNumbers(s.substring(0, s.length() - 3))+","+s.substring(s.length()-3,s.length());
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        System.out.println(commaNumbers(Integer.toString(n)));
    }
}
