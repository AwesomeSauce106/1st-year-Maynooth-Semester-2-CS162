import java.util.*;
public class LinearSearch1{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        double input = sc.nextDouble();
        //DO NOT CHANGE THE ARRAY DECLARATION
        double num[] = {254.98,3.43,43321.54};
        boolean bool = findElement(num, input);

        if(bool){
            System.out.println(input + " was found in the array");
        }else{
            System.out.println(input + " was NOT found in the array");
        }
    } 

    public static boolean findElement(double[] array, double input){
        for(int i = 0; i < array.length; i++){
            if(input == array[i]){
                return true;
            }
        }
        return false;
    }
}
