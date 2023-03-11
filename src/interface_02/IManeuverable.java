package interface_02;

public interface IManeuverable {
    void left();
    void right();
    void forward();
    void reverse();
    void climb();
    void dive();
    void setSpeed(double speed);
    double getSpeed();
}
