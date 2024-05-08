import java.util.*;
public class MethodOverload1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String shape = "";

        shape = sc.nextLine();
        if(shape.equals("Square")){
            int n = sc.nextInt(); 
            System.out.println("Area: " + area(n));
        }
        else if(shape.equals("Rectangle")){
            int n = sc.nextInt(), m = sc.nextInt();
            System.out.println("Area: " + area(n,m));
        }
        else if(shape.equals("Triangle")){
            double n = sc.nextDouble();
            int m = sc.nextInt();
            System.out.println("Area: " + area(n,m));
        }
        else if(shape.equals("Circle")){
            double n = sc.nextDouble();
            System.out.println("Area: " + area(n));
        }
        else if(shape.equals("Ellipse")){

            double n = sc.nextDouble(), m = sc.nextDouble();
            System.out.println("Area: " + area(n,m));
        }
        else{

            System.out.println("Not a valid shape!");
        }
    }

    // square
    public static double area(int a){
        double area = Math.pow(a,2);
        return area;
    }
    // rectangle
    public static double area(int a, int b){
        int area = a*b;
        return area;
    }
    // triangle
    public static double area(double a, int b){
        double area = (0.5)*a*b;
        return area;    
    }
    // circle
    public static double area(double a){
        double area = Math.PI*(Math.pow(a,2));
    return area;    
    }
    // ellipse
    public static double area(double a, double b){
        double area = Math.PI*(a*0.5)*(b*0.5);
        return area;
    }
}
