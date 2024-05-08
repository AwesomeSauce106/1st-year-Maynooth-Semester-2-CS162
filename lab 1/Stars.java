import java.util.*;

public class Stars{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);        // defines scanner
        int starNum = sc.nextInt();     // takes in levels to star triangle

        printStarTriangle(starNum);     // calls function
    }

    public static void printStarTriangle(int num){

        int i = 1, j = 0;     // setting iterator for the while loop
        while(i<=num){       // initializing the while loop (prints the rows)
            j = 0;      // sets j to 0

            while(j<i){     // j loops internally so the stars can be printed
                System.out.print("*");
                j++;        // increases the internal iterator by one
            }System.out.println();      // prints the new lines so stars are seperated    
            i++;        // adds one onto the iterator
        }
    }
}
