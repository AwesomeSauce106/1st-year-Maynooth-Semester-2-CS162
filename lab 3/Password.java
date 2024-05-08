import java.util.*;
public class Password{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int num = method(str);

        if(num > 0 && num < 4){
            System.out.println("Password strength: Weak");
        }else if(num >= 4 && num < 6){
            System.out.println("Password strength: Fair");
        }else if(num >= 6 && num < 8){
            System.out.println("Password strength: Good");
        }else if(num >= 8 && num <= 10){
            System.out.println("Password strength: Strong");
        }
    }

    public static int method(String st){
        int strong = 0;
        //1
        if(st.length() >= 8){
            strong++;
            //2
            if(st.length() >= 12){
                strong++;
            }
        }
        //3
        if(st.matches(".*[a-z].*")){
            strong++;
            //4
            if(st.matches(".*[a-z].*[a-z].*")){
                strong++;
            }
        }
        //5
        if(st.matches(".*[A-Z].*")){
            strong++;
            //6
            if(st.matches(".*[A-Z].*[A-Z].*")){
                strong++;
            }
        }
        //7
        if(st.matches(".*[0-9].*")){
            strong++;
            //8
            if(st.matches(".*[0-9].*[0-9].*")){
                strong++;
            }
        }
        //10
        if(st.matches(".*[#!?@].*")){
            strong++;
            //11
            if(st.matches(".*[#!?@].*[#!?@].*")){
                strong++;
            }
        }
        return strong;
    }
}
