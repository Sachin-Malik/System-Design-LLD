package Implementations.ParkingLot;

import java.util.List;

public class ParkingLotManager {
    List<ParkingSpot> parkingSpots;
    List<Ticket> ticketDB;

    ParkingLotManager(List<ParkingSpot> parkingSpots, List<Ticket> tickets) {
        this.parkingSpots = parkingSpots;
        ticketDB = tickets;
    }

    public ParkingSpot findParkingSpot() {
        for (ParkingSpot spot : parkingSpots) {
            if (spot.isEmpty) {
                return spot;
            }
        }
        return null;
    }

    public Boolean addTicket(Ticket ticket) {
        ticketDB.add(ticket);
        return true;
    }

    public void getParkingSpots() {
        for (ParkingSpot spot : parkingSpots) {
            System.out.println(spot.spotId + " is " + spot.isEmpty);
        }
        return;
    }

    public Ticket getTicketForVehicle(String registrationNumber) {
        for (Ticket ticket : ticketDB) {
            if (ticket.vehicle.registrationNumber == registrationNumber)
                return ticket;
        }
        return null;
    }

    public void markSpotAvailable(String spotId) {
        for (ParkingSpot spot : parkingSpots) {
            if (spot.spotId == spotId) {
                spot.isEmpty = true;
                break;
            }
        }
        return;
    }

    public void markSpotNotEmpty(String spotId) {
        for (ParkingSpot spot : parkingSpots) {
            if (spot.spotId == spotId) {
                spot.isEmpty = false;
                break;
            }
        }
        return;
    }

    public void getTicketInSystem() {
        for (Ticket ticket : ticketDB) {
            System.out.println("Ticked No. " + ticket.parkingSpot.spotId + " has Status of " + ticket.exitedAt);
        }
    }
}
