
public class Ship {
    
    String shipName;
    int yearBuilt;
    
    public Ship(String newShipName, int newYearBuilt) {
        this.shipName = newShipName;
        this.yearBuilt = newYearBuilt;
    }

    public String getShipName() {
        return shipName;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }

    void printShipNameAndYear() {
        System.out.println("Ship name: " + shipName + " Year: " + yearBuilt);
    }




}
