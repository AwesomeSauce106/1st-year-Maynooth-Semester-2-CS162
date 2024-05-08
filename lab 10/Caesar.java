import java.util.*;
public class Caesar{
    // conversion
    public static String toCaesar(String s, int i){
        char[] ar = new char[s.length()];

        // loop through and change String
        for(int j = 0; j < s.length();j++){
            int pos = (int) s.charAt(j);

            // if character is a space
            if(s.charAt(j) == ' '){
                ar[j] = s.charAt(j);
            }

            // if the character is a Capital
            else if(pos < 90){
                if( (pos+i) > 90){
                    ar[j] = (char)(65 + ( (pos+i) - 91));
                }else{
                    ar[j] = (char)(pos + i);
                }
            }

            // If the character is a lower case
            else if(97 < pos && pos < 122){
                if( (pos+i) > 122){
                    ar[j] = (char)(97 + ( (pos+i) - 123));
                }else{
                    ar[j] = (char)(pos + i);
                }

            }
            // Cant remember why this is here
            // but code doesnt work without it
            else{
                ar[j] = (char)(pos + i);
            }
        }
        return new String(ar);
    }
// main
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int i = sc.nextInt();

        sc.close();

        System.out.println(toCaesar(s,i));
    }
}
