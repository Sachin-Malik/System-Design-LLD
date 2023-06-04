package Implementations.ParkingLot;

public class Vehicle {
    public enum VehichleType {
        FOUR_WHEELER("FOUR_WHEELER"),
        TWO_WHEELER("TWO_WHEELER");

        private final String value;

        private VehichleType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    public String registrationNumber;
    public VehichleType vehichleType;

    Vehicle(String plateNumber, VehichleType type) {
        registrationNumber = plateNumber;
        vehichleType = type;
    }
}
