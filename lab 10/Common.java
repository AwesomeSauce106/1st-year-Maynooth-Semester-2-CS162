import java.util.*;
public class Common{
    private static int common = 0;
    private static int count = 0;

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), n1 = sc.nextInt(); 
        sc.close();

        findCommon(n,n1);
        countCommon(n);
        countCommon(n1);
        if(count == 0){
            System.out.println("No Common Number");
        }else{
            System.out.println(common + " " + count);
        }
    }

    // find amount of common numbers
    public static void findCommon(int n, int n1){
        for(int i = n; i > 0; i = i/10){
            for(int j = n1; j > 0; j = j/10){
                if(i%10 == j%10){
                    common = i%10;
                    break;
                }
            }
        }
    }

    public static void countCommon(int n){
        for(int i = n; i > 0; i = i/10){
            if(i%10 == common){
                count++;
            }
        }
    }

}
