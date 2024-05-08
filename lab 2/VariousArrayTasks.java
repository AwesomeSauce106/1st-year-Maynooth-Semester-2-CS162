import java.util.*;
public class VariousArrayTasks{
    public static void main(String[] args){
        int [] array = fillArray();                              // fills array
        System.out.println("Sum = " + sumArray(array));          // finds array total
        System.out.println("Average = " + avgArray(array));      // finds average of array
        printArray(array);                                       // prints array
    }

    public static int[] fillArray(){
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] array = new int[size];

        for(int i = 0; i < size; i++){
            array[i] = sc.nextInt(); 
        }

        sc.close();

        return array;
    }

    public static int sumArray(int[] array){
        int sum = 0;

        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        return sum;
    }

    public static double avgArray(int[] array){
        double average = 0,sum = 0;

        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }
        average = sum/array.length;

        return average;
    }

    public static void printArray(int[] array){
        for(int i = 0; i < array.length; i++){
            System.out.print(array[i]+" ");
        }
    }
}
