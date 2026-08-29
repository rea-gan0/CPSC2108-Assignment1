public class Student {
    String name;
    String course;

    public Student(String name, String course) {
        this.name = name;
        this.course = course;
    }

    public void displayStudentInfo() {
        System.out.println("Student: " + name);
        System.out.println("Course: " + course);
    }
}