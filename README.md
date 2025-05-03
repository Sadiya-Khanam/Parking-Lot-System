# Parking-Lot-System

The Parking Lot System allows different types of vehicles (like cars and bikes) to enter, park in available spots, and exit. The system keeps track of floors, parking slots, and vehicles, and handles assigning and freeing slots.

 Requirements:
  .There are multiple floors and parking slots.
  .Slots are of different types: Two-Wheeler, Car, Truck.
  .Vehicles can enter and exit.
  .A ticket is issued when a vehicle enters and is closed when it exits.
  .Parking charges can be added optionally.

Classes: 
  Vehicle: abstract type for all vehicles.Car, Bike: concrete types.
  ParkingSlot: slot assigned to vehicles.
  ParkingFloor: holds multiple slots.
  ParkingLot: coordinates all floors.
  Ticket: generated when a vehicle enters.
  EntryGate and ExitGate: handle incoming and outgoing logic.

Responsibilities:

1. Vehicle
   
     Represents a vehicle (Car, Bike).

     Fields: vehicleNumber, type.

    Can be extended for different vehicle types.

3. ParkingSlot:
   
    Represents a slot in the parking lot.

    Fields: id, isAvailable, allowedVehicleType.

    Tracks whether the slot is free or occupied.

3. ParkingFloor:
   
    A level in the parking lot.

    Holds multiple slots.

    Methods to assign a slot, check availability, or free a slot.

4. EntryGate / ExitGate:
   
   Simulates entry/exit points.

   EntryGate: assigns a slot.

   ExitGate: frees the slot.

5. ParkingLot:
   
  Central class coordinating everything.

  Has multiple floors and entry/exit gates.

  Method to assign slots across floors.

6. Ticket:

  Generated when a vehicle enters.
   
Relationships:

 ParkingLot → has many ParkingFloors.

 ParkingFloor → has many ParkingSlots.

 ParkingSlot → may have a Vehicle.

 Ticket → maps a Vehicle to a ParkingSlot.

 EntryGate → allocates a ParkingSlot, issues a Ticket.

 ExitGate → takes a Ticket and releases the slot.

