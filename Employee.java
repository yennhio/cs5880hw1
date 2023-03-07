public class Employee {
    
    String firstName;
    String lastName;
    String ssn;

    public void setFirstName(String newFirst) {
        this.firstName = newFirst;
    }

    public void setLastName(String newLast) {
        this.lastName = newLast;
    }

    public void setSSN(String newSSN) {
        this.ssn = newSSN;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSSN() {
        return ssn;
    }

}