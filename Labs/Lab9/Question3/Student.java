package Question3;

public class Student {
    private String studentId;
    private String studentName;
    static String universityName;

    public Student(String studentId,String studentName){
        this.studentId = studentId;
        this.studentName = studentName;
    }

    public void displayStudentInfo(){
        System.out.println("Student ID: " + studentId);
        System.out.println("Student Name: " + studentName);
        System.out.println("University Name: " + universityName);
    }
}

class StudentApp{
    public static void main(String[] args) {
        Student.universityName = "OpenAI University";

        Student student1 = new Student("1234","Sandaru");
        Student student2 = new Student("5678","Bob");
        Student student3 = new Student("9012","Nipuna");

        student1.displayStudentInfo();
        System.out.println();
        student2.displayStudentInfo();
        System.out.println();
        student3.displayStudentInfo();
        System.out.println();

        // Changing the university name for all students
        Student.universityName = "University of Miami";
        student1.displayStudentInfo();
        System.out.println();
        student2.displayStudentInfo();
        System.out.println();
        student3.displayStudentInfo();
    }
}