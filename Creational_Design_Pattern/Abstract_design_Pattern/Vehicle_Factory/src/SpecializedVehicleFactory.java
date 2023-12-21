public class SpecializedVehicleFactory implements Factory{

    @Override
    public FlyingVehicle createFlyingVehicle(String vehicleType){
        if(vehicleType.trim().equalsIgnoreCase("bike")){
            return new Bike();
        }
        if(vehicleType.trim().equalsIgnoreCase("car")){
            return new Car();
        }
        return null;
    }

    @Override
    public SurfaceVehicle createSurfaceVehicle(String vehicleType){
        if(vehicleType.trim().equalsIgnoreCase("bike")){
            return new Bike();
        }
        if(vehicleType.trim().equalsIgnoreCase("car")){
            return new Car();
        }
        return null;
    }

}
