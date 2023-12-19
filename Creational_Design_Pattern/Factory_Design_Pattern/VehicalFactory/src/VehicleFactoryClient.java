public class VehicleFactoryClient {
    public static void main(String[] args) {

        Vehicle carObject = VehicleFactory.createVehicleObject("car");
        carObject.showVehicleType();

        Vehicle bikeObject = VehicleFactory.createVehicleObject("bike");
        bikeObject.showVehicleType();

    }
}