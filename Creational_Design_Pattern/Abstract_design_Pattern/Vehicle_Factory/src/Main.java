public class Main {
    public static void main(String[] args) {
        SpecializedVehicleFactory flyingVehicle = new SpecializedVehicleFactory();
        SpecializedVehicleFactory surfaceVehicle = new SpecializedVehicleFactory();

        FlyingVehicle flyingCar = flyingVehicle.createFlyingVehicle("car");
        FlyingVehicle flyingBike = flyingVehicle.createFlyingVehicle("bike");

        flyingCar.buildFlyingVehicle();
        flyingBike.buildFlyingVehicle();

        SurfaceVehicle surfaceCar = surfaceVehicle.createSurfaceVehicle("car");
        SurfaceVehicle surfaceBike = surfaceVehicle.createSurfaceVehicle("bike");

        surfaceCar.buildSurfaceVehicle();
        surfaceBike.buildSurfaceVehicle();

    }
}