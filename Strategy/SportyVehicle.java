package Strategy;

import Strategy.DriveStrategy.SportyDriveStrategy;

public class SportyVehicle extends Vehicle {

    SportyVehicle() {
        super(new SportyDriveStrategy());
    }
}
