
public class Ship {
    
    String shipName;
    int yearBuilt;
    
    public Ship() {
        shipName = "";
        yearBuilt = 0;
    }

    public void setShipName(String newShipName) {
        this.shipName = newShipName;
    }

    public void setYearBuilt(int newYearBuilt) {
        this.yearBuilt = newYearBuilt;
    }

    public String getShipName() {
        return shipName;
    }

    public int getYearBuilt() {
        return yearBuilt;
    }

    void printShipInfo() {
        System.out.println("Ship name: " + shipName + " Year: " + yearBuilt);
    }




}
