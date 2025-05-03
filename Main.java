import java.util.Arrays;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        // Create parking slots
        ParkingSlot slot1 = new ParkingSlot("S1", Vehicle.VehicleType.CAR);
        ParkingSlot slot2 = new ParkingSlot("S2", Vehicle.VehicleType.CAR);
        ParkingSlot slot3 = new ParkingSlot("S3", Vehicle.VehicleType.BIKE);

        // Create parking floors
        ParkingFloor floor1 = new ParkingFloor(Arrays.asList(slot1, slot2));
        ParkingFloor floor2 = new ParkingFloor(Arrays.asList(slot3));

        // Create parking lot
        ParkingLot parkingLot = new ParkingLot(Arrays.asList(floor1, floor2));

        // Create gate
        Gate entryGate = new Gate(parkingLot);

        // Create vehicles
        Vehicle car = new Vehicle("V1", Vehicle.VehicleType.CAR);
        Vehicle bike = new Vehicle("V2", Vehicle.VehicleType.BIKE);

        // Vehicle enters parking lot
        Ticket ticket1 = entryGate.vehicleEntry(car);
        Ticket ticket2 = entryGate.vehicleEntry(bike);

        if (ticket1 != null) {
            System.out.println("Car parked with ticket ID: " + ticket1.getTicketId());
        } else {
            System.out.println("No available slot for the car.");
        }

        if (ticket2 != null) {
            System.out.println("Bike parked with ticket ID: " + ticket2.getTicketId());
        } else {
            System.out.println("No available slot for the bike.");
        }

        // Vehicle exits
        entryGate.vehicleExit(slot1);
        System.out.println("Slot S1 is now vacated.");
    }
}

