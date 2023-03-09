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

    public Instructor geInstructor() {
        return instructor;
    }

    public void setInstructor (Instructor instructor) {
        this.instructor = instructor;
    }

    public void setTextbook(Textbook textbook) {
        this.textbook = textbook;
    }

    public Textbook getTextbook() {
        return textbook;
    }

    public void printCourseInfo() {
        System.out.println("Course name: " + courseName);
        System.out.println("Instructor: " + instructor.getFirstName() + " " + instructor.getLastName());
        System.out.println("Textbook title and author: " + textbook.getBookTitle() + " by " + textbook.getAuthor());

    }


}
