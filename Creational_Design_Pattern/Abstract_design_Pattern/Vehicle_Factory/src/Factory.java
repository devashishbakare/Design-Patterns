public interface Factory {
    FlyingVehicle createFlyingVehicle(String vehicleType);
    SurfaceVehicle createSurfaceVehicle(String vehicleType);
}
