package inheritance;
public class HourlyEmployee extends Employee {

    int wage;
    int hoursWorked;

    public void setWage(int newWage) {
        this.wage = newWage;
    }

    public void setHoursWorked(int newHoursWorked) {
        this.hoursWorked = newHoursWorked;
    }

    public int getWage() {
        return wage;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }
    
}
