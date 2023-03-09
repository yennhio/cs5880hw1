package aggregation;


public class AggDriver {

    public static void main(String[] args) {

        Course courseOne = new Course();

        courseOne.setCourseName("CS5800");

        Instructor instructorOne = new Instructor();

        instructorOne.setFirstName("Nima");
        instructorOne.setLastName("Davarpanah");
        instructorOne.setOfficeNumber("3-2636");

        Textbook textbookOne = new Textbook();
        
        textbookOne.setAuthor("Robert C. Martin");
        textbookOne.setBookTitle("Clean Code");
        textbookOne.setPublisher("Prentice Hall");

        courseOne.setInstructor(instructorOne);
        courseOne.setTextbook(textbookOne);

        courseOne.printCourseInfo();

    }
    




}
