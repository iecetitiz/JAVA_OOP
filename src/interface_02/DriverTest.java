package interface_02;

public class DriverTest {
    public static void main(String[] args) {
        Driver d = new Driver(new Car());
        d.travel();

        MyStyle_Driver md = new MyStyle_Driver(new Bicycle());
        md.takeATravel();


    }
}
