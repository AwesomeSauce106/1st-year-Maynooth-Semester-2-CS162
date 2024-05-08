import java.util.*;
public class FlightCodes{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        while(checker(str) == false){
            System.out.println(str + "\nFlight code is NOT valid");
            str = sc.nextLine();
        }
        sc.close();
        System.out.println(str + "\nFlight code is valid");
    }
    public static boolean checker(String st){
        if(st.matches("[A-Z]{2,3}[0-9]{3,4}")){
            return true;
        }else{
            return false;
        }
    }
}
