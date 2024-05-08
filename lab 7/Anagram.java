import java.util.*;
public class Anagram{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine(), s1 = sc.nextLine();
        String[] a = s.split(""), a1 = s1.split("");

        a = sorter(a);
        a1 = sorter(a1);

        if(Arrays.equals(a,a1)){
            print(a,a.length);
        }else{
            print(a,a.length);
            print(a1,a1.length);
        }
    }
    public static String[] sorter(String[] b){
        String temp;
        for(int i = 0; i < b.length; i++){
            for(int j = i+1; j < b.length; j++){
                if(b[j].compareTo(b[i]) < 0){
                    temp = b[i];
                    b[i] = b[j];
                    b[j] = temp;
                }
            }
        }
        return b;
    }

    public static void print(String[] a, int n){
        for(int i = 0; i < n; i++){
            System.out.print(a[i]);
        }
        System.out.println();
    }
}
