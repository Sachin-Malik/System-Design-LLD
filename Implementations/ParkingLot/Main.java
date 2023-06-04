package Implementations.ParkingLot;

import java.util.ArrayList;
import java.util.List;

import Implementations.ParkingLot.Vehicle.VehichleType;

public class Main {
    public static void main(String[] args) {

        List<ParkingSpot> spotList = addDummyParkingSpots();
        List<Ticket> ticketList = new ArrayList<Ticket>();
        ParkingLotManager manager = new ParkingLotManager(spotList, ticketList);

        EntryGate entryGate1 = new EntryGate(manager);
        ExitGate exitGate1 = new ExitGate(manager);

        Ticket ticket = entryGate1.addVehicle(new Vehicle("PBX122", VehichleType.FOUR_WHEELER));
        Ticket ticket2 = entryGate1.addVehicle(new Vehicle("SM069N", VehichleType.TWO_WHEELER));

        ticket.getTicketDetails();
        exitGate1.removeVehicle(ticket2);
        manager.getTicketInSystem();

    }

    public static List<ParkingSpot> addDummyParkingSpots() {
        List<ParkingSpot> list = new ArrayList<ParkingSpot>();
        for (int i = 0; i < 2; i++) {
            ParkingSpot spot = new ParkingSpot(true, i + "GHI", VehichleType.FOUR_WHEELER);
            list.add(spot);
        }
        for (int i = 0; i < 2; i++) {
            ParkingSpot spot = new ParkingSpot(true, i + "SA", VehichleType.TWO_WHEELER);
            list.add(spot);
        }
        return list;
    }

}
