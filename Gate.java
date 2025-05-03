public class Gate {
    private ParkingLot parkingLot;

    public Gate(ParkingLot parkingLot) {
        this.parkingLot = parkingLot;
    }

    public Ticket vehicleEntry(Vehicle vehicle) {
        return parkingLot.parkVehicle(vehicle);
    }

    public void vehicleExit(ParkingSlot slot) {
        parkingLot.vacateSlot(slot);
    }
}

