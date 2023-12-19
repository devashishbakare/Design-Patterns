public class VehicleFactory {
    public static Vehicle createVehicleObject(String vehicleType){

        if(vehicleType.trim().equalsIgnoreCase("car")){
            return new Car();
        }else if(vehicleType.trim().equalsIgnoreCase("bike")){
            return new Bike();
        }else{
            return null;
        }
    }
}
