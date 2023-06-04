package Implementations.ParkingLot;

import java.util.Date;

public class ExitGate {

    Vehicle vehicle;
    ParkingLotManager parkingLotManager;

    ExitGate(ParkingLotManager parkingLotManager) {
        this.parkingLotManager = parkingLotManager;
    }

    public long removeVehicle(Ticket ticket) {
        System.out.println("Asking me to remove vehicle with ID" + ticket.vehicle.registrationNumber);
        ticket.exitedAt = new Date().toString();
        long price = calculatePrice(ticket);
        parkingLotManager.markSpotAvailable(ticket.parkingSpot.spotId);
        return price;
    }

    public long calculatePrice(Ticket ticket) {
        long price = 122121;
        return price;
    }
}
