package aggregation;

public class Course {
    
    private String courseName;
    private Instructor instructor;
    private Textbook textbook;

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void printCourseInfo() {
        System.out.println("Course name: " + courseName);
        System.out.println("Instructor: " + instructor);
        System.out.println("Textbook title and author: " + textbook);

    }





}
