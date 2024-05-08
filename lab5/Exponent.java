import java.util.*;
public class Exponent{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt(),j = sc.nextInt();
        System.out.println(powerTo(i,j));
    }
    public static int powerTo(int i, int j){
        if (j == 1){
            return i;
        }else{
            return i * powerTo(i, j-1);
        }
    } 
}
