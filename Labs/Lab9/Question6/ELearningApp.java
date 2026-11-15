package Question6;

interface Enrollable {
    void enrollCourse(String courseName);
}

interface Techable{
    void assignCourse(String courseName);
}

class Student implements Enrollable{
    private String name;

    public Student(String name){
        this.name = name;
    }

    @Override
    public void enrollCourse(String courseName){
        System.out.println(name + " enrolled in course: " + courseName);
    }
}

class Instructor implements Enrollable,Techable{
    private String name;

    public Instructor(String name){
        this.name = name;
    }

    @Override
    public void enrollCourse(String courseName){
        System.out.println("Instructor " + name + "enrolled in course for training: " + courseName);
    }

    @Override
    public void assignCourse(String courseName){
        System.out.println("Instructor " + name + " assigned to teech course: " + courseName);
    }
}

public class ELearningApp{
    public static void main(String[] args) {

        Student student = new Student("Sandaru");
        Instructor instructor = new Instructor("Dr. Thilini");

        student.enrollCourse("Java Programming");

        instructor.enrollCourse("Advanced Teaching Methods");
        instructor.assignCourse("Software Engineering");
    }
}
