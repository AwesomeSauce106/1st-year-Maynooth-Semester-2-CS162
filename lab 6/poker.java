import java.util.*;
public class poker{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] hand = new String[5];

        for(int i = 0; i < 5; i++){
            hand[i] = sc.nextLine();
        }

        fullHouseCheck(hand);
    }
    public static void fullHouseCheck(String[] a){
        Arrays.sort(a);
        if(a[0].equals(a[1]) && a[1].equals(a[2]) && a[3].equals(a[4])
        || a[0].equals(a[1]) && a[2].equals(a[3]) && a[3].equals(a[4]))
        {
            if(a[0].equals(a[2])){
                System.out.println("3 of a kind: " + a[0]);
                System.out.println("2 of a kind: " + a[3]);
            }else{
                System.out.println("3 of a kind: " + a[2]);
                System.out.println("2 of a kind: " + a[0]);
            }
        }else{
            System.out.println("Not a full house");
        }
    }
}

//  System.out.println();
