import java.util.*;
public class WhichExpression{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String st1 = sc.nextLine();
        checker(st1);
    }

    public static void checker(String str){
        int ticker = 0;
        if(str.matches("a(a|b)b")){
            System.out.println("1");
            ticker++;
        }
        if(str.matches("(ab)*b")){
            System.out.println("2");
            ticker++;
        }
        if(str.matches("a(b|a)*")){
            System.out.println("3");
            ticker++;
        }
        if(str.matches("((a|b)a)*")){
            System.out.println("4");
            ticker++;
        }
        if(ticker<=0){
            System.out.println("Not in language");
        }
        
    }
}
