public class Student{


    private String name;
    private int rollNo;

    public String getName(){
        return name;
    }

    public int getRollNo(){
        return rollNo;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setRollNO(int rollNo){
        this.rollNo=rollNo;
    }
    
    public Student(String name, int rollNo){

        this.name=name;
        this.rollNo=rollNo;
    }

    public static void main(String[] args) {
        Student student = new Student("Sachin", 123);
        System.out.println("Student name: "+student.getName());
        System.out.println("Student Roll No : "+student.getRollNo());
    }

}   