public class Student{
    // A1
    private String name;
    private String course;
    private static int uid = 1000;
    private int studentID;

    public Student(){       // A2
        name = "James Kavanagh";
        course = "Comp Sci";
        uid++;
        studentID = uid;
    }
    public Student(String s, String s1){        // A3
        name  = s;
        course  = s1;
        uid++;
        studentID = uid;
    }
    // A4
    public void setName(String s){
        name = s;
    }
    public void setCourse(String s){
        course = s;
    }
    public String getName(){
        return name;
    }
    public String getCourse(){
        return course;
    }
    // A5
    public int getStudentID(){
        return studentID;
    }
    // A6
    public void showStudent(){
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
        System.out.println("Student ID: " + studentID);
        System.out.println("---");
    }
}
