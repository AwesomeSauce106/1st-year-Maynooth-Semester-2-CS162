import java.util.*;
public class ValidName{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        while(checker(str) == false){
            System.out.println(str + "\nName is NOT valid");
            str = sc.nextLine();
        }
        sc.close();
        System.out.println(str + "\nName is valid");
    }

    public static boolean checker(String st){
        String parameters = "[A-Z]{1}[a-z]{1,24}";
        if(st.matches(parameters)){
            return true;
        }else{
            return false;
        }
            
    }
}
