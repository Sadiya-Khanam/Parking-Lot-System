import java.util.List;

public class ParkingLot {
    private List<ParkingFloor> floors;

    public ParkingLot(List<ParkingFloor> floors) {
        this.floors = floors;
    }

    public Ticket parkVehicle(Vehicle vehicle) {
        for (ParkingFloor floor : floors) {
            ParkingSlot slot = floor.getAvailableSlot(vehicle.getType());
            if (slot != null) {
                slot.park();
                return new Ticket(vehicle, slot);
            }
        }
        return null; // No available slot
    }

    public void vacateSlot(ParkingSlot slot) {
        slot.vacate();
    }

    public ParkingSlot findAvailableSlot(Vehicle.VehicleType type) {
        for (ParkingFloor floor : floors) {
            ParkingSlot slot = floor.getAvailableSlot(type);
            if (slot != null) {
                return slot;
            }
        }
        return null;
    }
}

