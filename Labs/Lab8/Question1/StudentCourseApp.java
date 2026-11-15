package Question1;

public class StudentCourseApp {
    public static void main(String[] args) {
        Course course1 = new Course("SE1020","Software Engineering");
        Course course2 = new Course("CS1030","Computer Science");
        Course course3 = new Course("DS1040","Data Science");

        Student student = new Student("IT2410","Sandaru Nipuna");

        student.enrollCourse(course1);
        student.enrollCourse(course2);
        student.enrollCourse(course3);

        student.displayStudentDetails();
    }
}
