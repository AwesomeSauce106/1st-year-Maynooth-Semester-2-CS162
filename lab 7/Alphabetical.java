import java.util.*;
public class Alphabetical{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        String[] ar = s.split("");
        sorter(ar);
    }

    public static void sorter(String[] a){
        String temp;
        for(int i = 0; i < a.length; i++){
            for(int j = i+1; j < a.length; j++){
                if(a[j].compareTo(a[i]) < 0){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            System.out.print(a[i]);
        }
    }
}
