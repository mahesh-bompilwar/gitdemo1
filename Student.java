public class Student{


    private String name;
    private int rollNo;

    public Student(String name, int rollNo){

        this.name=name;
        this.rollNo=rollNo;
    }

    public static void main(String[] args) {
        Student student = new Student("Sachin", 123);
        System.out.println("Student name: "+student.name);
        System.out.println("Student Roll No : "+student.rollNo);
    }

}   