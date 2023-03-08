package polymorphism;

public class CruiseShip extends Ship {
    int maxNumOfPassengers;

    public CruiseShip () {
        maxNumOfPassengers = 0;
    }

    public void setMaxNumOfPassengers(int newMaxNumOfPassengers) {
        maxNumOfPassengers = newMaxNumOfPassengers;
    }

    public int getMaxNumOfPassengers() {
        return maxNumOfPassengers;
    }

    @override
    public void printShipInfo() {
        System.out.println("Ship name: " + getShipName() + " Max num of passengers: " + getMaxNumOfPassengers());
    }

}
