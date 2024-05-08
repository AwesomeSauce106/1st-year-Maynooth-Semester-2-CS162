import java.util.*;
public class StringAcceptance{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();

        System.out.println(checker(st));
    }

    public static boolean checker(String str1){

        if(str1.matches("[01]*")){
            return true;
        }else{
            return false;
        }

    }
}
