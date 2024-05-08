import java.util.*;
public class Reverse2{
    public static String CaseSpaceNumbers(String str){
        char[] lettersAndNumbers = new char[str.length()];
        int count = 0;
        
        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(Character.isLetter(ch) || Character.isDigit(ch)){
                lettersAndNumbers[count++] = ch;
            }
        }

        for(int i = 0; i < count/2; i++){
            char temp = lettersAndNumbers[i];
            lettersAndNumbers[i] = lettersAndNumbers[count - 1 - i];
            lettersAndNumbers[count - 1 - i] = temp;
        }

        char[] reversedStringArray = new char[str.length()];
        int index = 0;

        for(int i = 0; i<str.length();i++){
            char ch = str.charAt(i);
            if(Character.isLetter(ch) || Character.isDigit(ch)){
                char reversedChar = lettersAndNumbers[index++];

                if(Character.isUpperCase(ch)){
                    reversedChar = Character.toUpperCase(reversedChar);
                }else{
                    reversedChar = Character.toLowerCase(reversedChar);
                }
                reversedStringArray[i] = reversedChar;
            }else{
            reversedStringArray[i] = ch;
            }
        }
        return new String(reversedStringArray);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("Reversed string: " + CaseSpaceNumbers(str));
    }
}
