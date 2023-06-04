package Implementations.ParkingLot;

import Implementations.ParkingLot.Vehicle.VehichleType;

public class ParkingSpot {
    public Boolean isEmpty;
    public String spotId;
    public Boolean isReserved;
    public VehichleType capacity;

    ParkingSpot(Boolean isEmpty, String spotId, VehichleType capacity) {
        this.isEmpty = isEmpty;
        this.spotId = spotId;
        this.isReserved = false;
        this.capacity = capacity;
    }

    ParkingSpot(Boolean isEmpty, String spotId, Boolean isReserved, VehichleType capacity) {
        this.isEmpty = isEmpty;
        this.spotId = spotId;
        this.isReserved = isReserved;
        this.capacity = capacity;

    }
}
