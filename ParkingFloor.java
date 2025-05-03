
import java.util.List;

public class ParkingFloor {
    private List<ParkingSlot> slots;

    public ParkingFloor(List<ParkingSlot> slots) {
        this.slots = slots;
    }

    public ParkingSlot getAvailableSlot(Vehicle.VehicleType type) {
        for (ParkingSlot slot : slots) {
            if (slot.getType() == type && slot.isAvailable()) {
                return slot;
            }
        }
        return null;
    }
}
