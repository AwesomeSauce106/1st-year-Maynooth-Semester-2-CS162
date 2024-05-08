import java.util.*;
public class TestEmployee{
    public static void main(String[] args){
        // 1
        Employee e = new Employee("Tom Daly","Teacher",45000);
        Employee e1 = new Employee("Mary Murphy","Developer",30000);
        Employee e2 = new Employee();

        // 2
        System.out.println("Employee 2 is called " + e1.getName());
        System.out.println("They are a " + e1.getJobTitle());
        System.out.println("Their salary is " + e1.getSalary());
        System.out.println("Their Employee ID number is " + e1.getEmployeeID());

        e2.setName("Michael Higgins");
        e2.setJobTitle("President");
        e2.setSalary(1000);

        e.showEmp();
        e1.showEmp();
        e2.showEmp();

        System.out.println(e.toString());

    }
}
