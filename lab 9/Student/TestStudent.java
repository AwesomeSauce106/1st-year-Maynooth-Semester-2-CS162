import java.util.*;
public class TestStudent{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // B1
        Student[] stu = new Student[3];
        for(int i = 0; i < 3; i++){
            stu[i] = new Student(sc.nextLine(), sc.nextLine());
        }
        sc.close();

        // B2
        for(int i = 0; i < 3; i++){
            stu[i].showStudent();
        }

        // B3
        stu[0].setCourse("CSSE");
        stu[0].showStudent();

        stu[2].setName("Louise Johnson");
        System.out.println(stu[2].getName());
    }
}
