package polymorphism;

public class CargoShip extends Ship {
    
    int cargoCapacityInTonnage;

    public CargoShip() {
        cargoCapacityInTonnage = 0;
    }

    public void setCargoCapacityInTonnage(int newCargoCapacityInTonnage) {
        this.cargoCapacityInTonnage = newCargoCapacityInTonnage;
    }

    public int getCargoCapacityInTonnage() {
        return cargoCapacityInTonnage;
    }

    @override
    public void printShipInfo() {
        System.out.println("Ship name: " + getShipName() + " Cargo capacity: " + getCargoCapacityInTonnage());
    }

}
