public class Driver {

    public static void main (String[] args) {

        SalariedEmployee joe = new SalariedEmployee();

        joe.setFirstName("Joe");
        joe.setLastName("Jones");
        joe.setSSN("111-11-1111");
        joe.setWeeklySalary(2500);

        SalariedEmployee renwa = new SalariedEmployee();

        renwa.setFirstName("Renwa");
        renwa.setLastName("Chanel");
        renwa.setSSN("555-55-5555");
        renwa.setWeeklySalary(1700);

        HourlyEmployee stephanie = new HourlyEmployee();

        stephanie.setFirstName("Stephanie");
        stephanie.setLastName("Smith");
        stephanie.setSSN("222-22-2222");
        stephanie.setWage(25);
        stephanie.setHoursWorked(32);

        HourlyEmployee mary = new HourlyEmployee();
       
        mary.setFirstName("Mary");
        mary.setLastName("Quinn");
        mary.setSSN("333-33-3333");
        mary.setWage(19);
        mary.setHoursWorked(47);

        CommissionEmployee nicole = new CommissionEmployee();

        nicole.setFirstName("Nicole");
        nicole.setLastName("Dior");
        nicole.setSSN("444-44-4444");
        nicole.setCommissionRate(15);
        nicole.setGrossSales(50000);

        CommissionEmployee mahnaz = new CommissionEmployee();

        mahnaz.setFirstName("Mahnaz");
        mahnaz.setLastName("Vaziri");
        mahnaz.setSSN("777-77-7777");
        mahnaz.setCommissionRate(22);
        mahnaz.setGrossSales(40000);

        BaseEmployee mike = new BaseEmployee();

        mike.setFirstName("Mike");
        mike.setLastName("Davenport");
        mike.setSSN("666-66-6666");
        mike.setBaseSalary(95000);

    }
    
}
