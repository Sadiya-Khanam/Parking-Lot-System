public class Vehicle {
    private String vehicleId;
    private VehicleType type;

    public enum VehicleType {
        CAR,
        BIKE
    }

    public Vehicle(String vehicleId, VehicleType type) {
        this.vehicleId = vehicleId;
        this.type = type;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public VehicleType getType() {
        return type;
    }
}

