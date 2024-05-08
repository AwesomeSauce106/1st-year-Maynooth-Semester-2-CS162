import java.util.*;
public class BinarySearchGame{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        //DO NOT CHANGE THE start AND end VARIABLES
        int start = 1;
        int end = 10;
        sc.close();
        int[] result = binarySearch(start, end, target);

        if (result[0] != -1){
            System.out.println("The number is: "+ target+"\nIt took "+result[1]+" tries!");
        }else{
            System.out.println("The number is: "+ target+"was not found in the range");
        }

    }
    public static int[] binarySearch(int start, int end, int target){
        int guesses = 0;
        while(start <= end){
            int mid = (start + end)/2;
            guesses++;
            
            if (target < mid){
                end = mid - 1;
            }else if(target > mid){
                start = mid +1;
            }
            else{
                return new int[] {mid,guesses};
            }
        }
        return new int[] {-1,guesses};
    }
}
