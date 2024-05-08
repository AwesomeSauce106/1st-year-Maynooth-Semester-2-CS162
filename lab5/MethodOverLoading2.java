import java.util.*;
public class MethodOverLoading2{
    //1
    public static String manipulation(String st){
        return st.replaceAll(" ", "");
    }

    //2
    public static String manipulation(String st, char ch){
        return st.replace(Character.toString(ch),"");
    }

    //3
    public static String manipulation(String st, int i){
        if(i == -1){
            return st;
        }
        return st.replace(Character.toString(st.charAt(i)),"");
    }

    //4
    public static String manipulation(String st, int i, int j){
        return st.substring(0,i+1) + st.substring(j);
    }

    //5
    public static String manipulation(String st, char ch, char ch2){
        int i = st.indexOf(ch), j = st.lastIndexOf(ch2);
        return st.substring(0,i+1) + st.substring(j);
    }

    //6                 THE PROBLEM         REMOVE EVERYTHING BEHIND THE INDEX OF THE 3RD CHAR
    public static String manipulation(String st, char ch, int x){
        int a = 0;

        for(int i = 0; i <= st.length(); i++){
            if(st.charAt(i) == ch){
                a++;
                if(a == x){
                    x = i;
                    break;
                }
            }
        }


        return st.substring(x);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String st = "";
        while(n >0){
            st =st + sc.next()+" ";
            n--;
        }

        st = st.toLowerCase();
        int x = sc.nextInt(), x1 = sc.nextInt();
        char c = sc.next().charAt(0), c1 = sc.next().charAt(0);
        //System.out.println(x+"\n"+x1+"\n"+c+"\n"+c1);
        System.out.println(manipulation(st));
        System.out.println(manipulation(st, c));
        System.out.println(manipulation(st, x));
        System.out.println(manipulation(st, x, x1));
        System.out.println(manipulation(st, c, c1));
        System.out.println(manipulation(st, c, x));
    }
}
