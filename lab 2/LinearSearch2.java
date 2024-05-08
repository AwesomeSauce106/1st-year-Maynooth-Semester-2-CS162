import java.util.*;
public class LinearSearch2{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        //DO NOT CHANGE THE ARRAY DECLARATION
        String words[][] = {{"cat", "dog", "dUck"}, {"rabbit", "hen", "duCk"}, {"dUcK", "DucK", "goose"}};
        int tot = countStrings(words, input);

        if(tot == 0){
            System.out.println(input + " was NOT found in the array");
        }else{
            System.out.println(input + " is contained in the array " + tot + " times");
        }
    }

    public static int countStrings(String[][] ar, String str){
        int num = 0;

        for(int i = 0; i < ar.length; i++){
            for(int j = 0; j < ar[i].length; j++){
                if((ar[i][j].toLowerCase()).equals((str.toLowerCase()))){
                    num++;
                }
            }
        }
        return num;
    }
}
