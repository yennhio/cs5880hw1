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

        Course courseTwo = new Course();

        courseTwo.setCourseName("CS3200");

        Instructor instructorTwo = new Instructor();

        instructorTwo.setFirstName("Jay");
        instructorTwo.setLastName("Docks");
        instructorTwo.setOfficeNumber("8-345");

        Textbook textbookTwo = new Textbook();
        
        textbookTwo.setAuthor("Chicken Cutlet");
        textbookTwo.setBookTitle("Coding 101");
        textbookTwo.setPublisher("Barnes");

        courseTwo.setInstructor(instructorTwo);
        courseTwo.setTextbook(textbookTwo);

        courseTwo.printCourseInfo();

    }
    




}
