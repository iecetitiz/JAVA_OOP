package interface_02;

public class MyStyle_Driver {
    IManeuverable vehicle;
    public MyStyle_Driver(IManeuverable vehicle) { //Benim bir vehicle'm var, IManeuverable bir vehicle hem de, ama bunun ne olacagina yaratilirken
        //karar veriyorum woooooow cok guzel
        this.vehicle = vehicle;
    }

    public void takeATravel() {
        vehicle.forward();
    }
}
