public class Car implements FlyingVehicle, SurfaceVehicle{

    @Override
    public void buildFlyingVehicle(){
        System.out.println("Building Flying car");
    }
    @Override
    public void buildSurfaceVehicle(){
        System.out.println("Building surface car");
    }

}
