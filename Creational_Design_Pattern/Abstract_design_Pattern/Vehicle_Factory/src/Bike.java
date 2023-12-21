public class Bike implements FlyingVehicle, SurfaceVehicle{
    @Override
    public void buildSurfaceVehicle(){
        System.out.println("Building surface bike");
    }
    @Override
    public void buildFlyingVehicle(){
        System.out.println("Building flying bike");
    }
}
