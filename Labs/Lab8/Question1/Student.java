package Question1;

public class Student {
    private String studentID;
    private String studentName;
    private int courseCount = 0;
    Course[] courses = new Course[3];

    public Student(){
        this.studentID = "N/A";
        this.studentName = "N/A";
    }

    public Student(String studentID, String studentName){
        this.studentID = studentID;
        this.studentName = studentName;
    }

    public void enrollCourse(Course c){
        if(courseCount < 3){
            courses[courseCount] = c;
            courseCount++;
        }else{
            System.out.println("Maximum Limit Reached!");
        }
    }

    public void displayStudentDetails(){
        System.out.println("===Student Details===");
        System.out.println("Student ID: " + studentID);
        System.out.println("Student Name: " + studentName);
        System.out.println("===Course Details===");
        for(int i=0; i<courses.length; i++){
            courses[i].displayCourseDetails();
        }
    }
}
