public class ParkingSlot {
    private String id;
    private Vehicle.VehicleType type;
    private boolean isOccupied;

    public ParkingSlot(String id, Vehicle.VehicleType type) {
        this.id = id;
        this.type = type;
        this.isOccupied = false;
    }

    public boolean isAvailable() {
        return !isOccupied;
    }

    public void park() {
        if (isAvailable()) {
            isOccupied = true;
        }
    }

    public void vacate() {
        isOccupied = false;
    }

    public String getId() {
        return id;
    }

    public Vehicle.VehicleType  getType() {
        return type;
    }
}

