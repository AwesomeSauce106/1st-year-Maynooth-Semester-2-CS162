import java.util.*;
public class AddAs{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String s1 = moreAs(s);
        System.out.println(s1);
    }
    public static String moreAs(String s){
        if(s.isEmpty()){
            return s;
        }else{
            if(s.charAt(0) == 'a'){
                return "aaa" + moreAs(s.substring(1));
            }else{
                return s.charAt(0) + moreAs(s.substring(1));
            }
        }
    }
}
