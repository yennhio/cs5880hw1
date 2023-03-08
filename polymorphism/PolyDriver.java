package polymorphism;

public class PolyDriver {

    public static void main(String[] args) {

            
        Ship[] arrayOfShips = new Ship[3];

        for (int i=0; i<3; i++) {

            if (i==0) {
                Ship shipOne = new Ship();
                shipOne.setShipName("Valerie");
                shipOne.setYearBuilt(2009);

                arrayOfShips[i] = shipOne;
            }
            else if (i==1) {
                CruiseShip shipTwo = new CruiseShip();
                shipTwo.setShipName("Maxwell");
                shipTwo.setYearBuilt(1999);
                shipTwo.setMaxNumOfPassengers(100);

                arrayOfShips[i] = shipTwo;
            }
            else {
                CargoShip shipThree = new CargoShip();
                shipThree.setShipName("Tonnage");
                shipThree.setYearBuilt(1990);
                shipThree.setCargoCapacityInTonnage(300);

                arrayOfShips[i] = shipThree;
            }



        }

        for (int j=0; j<3; j++) {
            arrayOfShips[j].printShipInfo();
        }


    }
}

