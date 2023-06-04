package Implementations.ParkingLot;

public class EntryGate {

    Ticket ticket;
    Vehicle vehicle;
    ParkingSpot parkingSpot;
    ParkingLotManager manager;

    EntryGate(ParkingLotManager manager) {
        this.manager = manager;
    }

    public Ticket addVehicle(Vehicle vehicle) {
        parkingSpot = findEmptySpot();
        ticket = generateTicket(vehicle, parkingSpot);
        manager.addTicket(ticket);
        manager.markSpotNotEmpty(parkingSpot.spotId);
        markSpotNotEmpty(parkingSpot);
        return ticket;
    }

    private ParkingSpot findEmptySpot() {
        ParkingSpot emptySpot = manager.findParkingSpot();
        return emptySpot;
    }

    private Ticket generateTicket(Vehicle vehicle, ParkingSpot parkingSpot) {
        ticket = new Ticket(vehicle, parkingSpot);
        return ticket;
    }

    private void markSpotNotEmpty(ParkingSpot parkingSpot) {
        parkingSpot.isEmpty = false;
    }
}
