package interface_02;

public class Bicycle implements IManeuverable{
    @Override
    public void left() {

    }

    @Override
    public void right() {

    }

    @Override
    public void forward() {
        System.out.println("I am a bicycle and Ece loves me!");
    }

    @Override
    public void reverse() {

    }

    @Override
    public void climb() {

    }

    @Override
    public void dive() {

    }

    @Override
    public void setSpeed(double speed) {

    }

    @Override
    public double getSpeed() {
        return 0;
    }
}
