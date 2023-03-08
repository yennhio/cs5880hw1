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

}
