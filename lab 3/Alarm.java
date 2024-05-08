import java.util.*;
public class Alarm{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        method(str);
    }
    public static void method(String st){
        if(st.matches("[01234]{1,10}")){
            System.out.println("Alarm Deactivated");
        }else{
            System.out.println("Alarm Activated");
        }
    }
}
