import java.util.*;
public class missingElement{
    public static void main (String args[]){
        //DO NOT CHANGE THE ARRAY DECLARATION
        int missing[]={1, 4, 7, 9, 3, 6, 8, 5};

        int missingNumber = findMissingNumber(missing);
        if(missingNumber != -1){
            System.out.println(missingNumber);
        }
    
    }
    public static void bubbleSort(int[] a){
        int n =a.length;
        for(int i = 0; i < n-1; i++){
            for(int j = 0; j < n-i-1; j++){
                if(a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
    }

    public static int findMissingNumber(int[] a){
        bubbleSort(a);
        int n = a.length;
        for(int i = 1;i < n+1; i++){
            if(a[i] - a[i-1] > 1){
                return a[i-1] + 1;
            }
        }
        return -1;
    }
}
