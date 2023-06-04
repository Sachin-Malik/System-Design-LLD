package Implementations.ParkingLot;

import java.util.Date;

public class Ticket {

    Vehicle vehicle;
    ParkingSpot parkingSpot;
    String enteredAt;
    String exitedAt = "NOT_EXITED";

    Ticket(Vehicle vehicle, ParkingSpot parkingSpot) {
        this.vehicle = vehicle;
        this.parkingSpot = parkingSpot;
        this.enteredAt = new Date().toString();
    }

    public void getTicketDetails() {
        System.out.println(vehicle.registrationNumber);
        System.out.println(parkingSpot.spotId);
        System.out.println(enteredAt);
    }

}
