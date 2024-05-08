import java.util.Scanner;
public class FindSubStrings{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine(),str2 = sc.nextLine();
        int num = sc.nextInt();
        System.out.println(checkForSub(str,str2,num));
    }

    public static boolean checkForSub(String st, String st2, int n){
        int a = check(st, st2);

        if(a == n){
            return true;
        }else{
            return false;
        }
    }

    public static int check(String st, String st2){
        if(st.isEmpty() || st.length() < st2.length()){
            return 0;
        }else{
            if(st.startsWith(st2)){
                return 1 + check(st.substring(1),st2);
            }else{
                return 0 + check(st.substring(1),st2);
            }
        }
    }
}
