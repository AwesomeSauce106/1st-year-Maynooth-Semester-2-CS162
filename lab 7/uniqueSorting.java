import java.util.*;
public class uniqueSorting{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] a = new int[sc.nextInt()];

        for(int i = 0; i < a.length; i++){
            a[i] = sc.nextInt();
        }
        
        print(a,a.length);
        System.out.println();

        a = uniqueSort(a);
        print(a,a.length);

        System.out.println();
    }

    // main task
    public static int[] uniqueSort(int[] a){
        // sorts array
        a = sorter(a);
        print(a,a.length);
        int n = a.length;
        int count = 0;

        // checking the amount of spaces needed for new array
        for(int i = 0; i < n-1; i++){
            if(a[i] != a[i+1]){
                count++;
                if(i == n-2){
                    count++;
                }
            }
        }

        // creating new array
        int[] result = new int[count];
        int f = 0;
        // putting values into new array
        for(int i = 0; i < n-1; i++){

            if(a[i] != a[i+1]){
                result[f] = a[i];
                f++;
                if(i == n-2){
                    result[count-1] = a[n-1];
                }
            }
        }
        
        return result;
    }


    // sorter
    public static int[] sorter(int[] a){
        int n = a.length;
        for(int i = 0; i < n - 1; i++){
            for(int j = 0; j < n - 1; j++){
                if(a[j] > a[j + 1]){
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j+1] = temp;
                }
            }
        }
        return a;
    }


    // print array
    public static void print(int[] a, int n){
        for(int i = 0; i < n; i++){
            System.out.print(a[i] + " ");
        }
    }

}
