import java.util.*;
public class BubbleSortInt{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] numAr = new int[sc.nextInt()];
        for(int i = 0; i < numAr.length;i++){
            numAr[i] = sc.nextInt();
        }

        int[] sorted = sorter(numAr);
        print(numAr);
    }
    public static int[] sorter(int[] a){
        for(int j = 0; j < a.length;j++){
            for(int i = 0; i < a.length-1;i++){
                // finds length of an int
                int length = (int)(Math.log10(a[i])+1);
                int length1 = (int)(Math.log10(a[i+1])+1);

                if(length < length1){
                    int temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                }
                else if(length == length1){

                    if(a[i] > a[i+1]){
                        int minitemp = a[i];
                        a[i] = a[i+1];
                        a[i+1] = minitemp;
                    }
                }
            }
        }
        return a;
    }
    public static void print(int[] a){
        for(int i = 0; i < a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
