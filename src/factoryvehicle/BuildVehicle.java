package factoryvehicle;

public class BuildVehicle {

    public Vehicle getVehicle(VehicleEnum vehicle) {
        switch (vehicle) {
            case BIKE:
                return new Bike(500);
            case CAR:
                return new Car(90);
            case MOTO:
                return new Moto(70);
            case PLANE:
                return new Plane(500);
            case TRAIN:
                return new Train(500);
            case TRUCK:
                return new Truck(500);
            default:
                throw new RuntimeException("Vehicle not recognized");
        }
    }

}
