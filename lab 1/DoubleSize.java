import java.util.*;
public class DoubleSize{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble(), num2 = sc.nextDouble();
        determineSize(num1,num2);
    }
    public static void determineSize(double n1, double n2){
        if(n1>n2){      // if number 1 is greater than number 2

            System.out.println("Largest = "+n1+"\nSmallest = "+n2);

        }else if(n1==n2){       // if number 1 is equal to number 2

            System.out.println("Both numbers are the same");

        }else{// if number 2 is greater than number 1
            System.out.println("Largest = "+n2+"\nSmallest = "+n1);
        }
    }
}
