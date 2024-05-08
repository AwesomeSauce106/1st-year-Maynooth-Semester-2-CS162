import java.util.*;
public class CombineReverse{
    public static String combine(int i){
        if(i/10 == 0){
            return i+"";
        }else{
            return i%10 + "" + combine(i/10);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<0){
            System.out.println("Not a valid entry!");
        }
        System.out.println(n + combine(n));
    }
}
