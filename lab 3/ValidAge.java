import java.util.*;
public class ValidAge{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        while(checker(str) == false){
            System.out.println(str + "\nAge is NOT valid");
            str = sc.nextLine();
        }
        System.out.println(str + "\nAge is valid");
    }

    public static boolean checker(String st){
        if(st.matches("[0-9]{1,2}")){
            return true;
        }
        else if(st.matches("1[0-4][0-9]")){
            return true;
        }
        else if(st.matches("150")){
            return true;
        }
        else{
            return false;
        }
    }
}
