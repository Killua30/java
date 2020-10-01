package third;

public interface Comp {

    String turnOn(int currentVoltage) throws ComputerTurnOnException;
    String turnOff() throws ComputerTurnOffException;
    String connect(ConnectionStatus status);
}
