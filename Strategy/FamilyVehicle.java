package Strategy;

import Strategy.DriveStrategy.NormalDriveStrategy;

public class FamilyVehicle extends Vehicle {

    FamilyVehicle() {
        super(new NormalDriveStrategy());
    }
}
