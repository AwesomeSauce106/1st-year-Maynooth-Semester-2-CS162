import java.util.*;
public class CleanString{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(cleanString(str,1));
    }

    public static String cleanString(String st, int pos){
        if(pos == 1)System.out.print(st.charAt(0));
        if(pos < st.length()-1){
            if(st.charAt(pos) != st.charAt(pos-1)){
                return (st.charAt(pos) + "" + cleanString(st, pos+1));
            }else{
            return ("" + cleanString(st, pos+1));
            }
        }
        else if(pos == st.length()-1){
            if(st.charAt(pos) != st.charAt(pos-1)){
                return (st.charAt(pos) + "");
            }else{
                return ("");
            }
        }
        else{
            return ("");
        }
    }
}
