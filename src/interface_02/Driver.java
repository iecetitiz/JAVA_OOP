package interface_02;

public class Driver {
    IManeuverable vehicle;
    public Driver(IManeuverable vehicle) {
        this.vehicle = vehicle;

    }

    public void travel() {
        vehicle.setSpeed(35);
        vehicle.forward();
        vehicle.left();
    }
}
