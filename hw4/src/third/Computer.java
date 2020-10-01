package third;

public class Computer implements Comp {
    private String maker;
    private String model;
    private String proc;
    private String ram;
    private String disk;
    boolean IsOn;
    int volt;

    public String getMaker() {
        return maker;
    }

    public String getModel() {
        return model;
    }

    public String getProc() {
        return proc;
    }

    public String getRam() {
        return ram;
    }

    public String getDisk() {
        return disk;
    }

    public Computer(String maker, String model, String proc, String ram, String disk) {
        this.maker = maker;
        this.model = model;
        this.proc = proc;
        this.ram = ram;
        this.disk = disk;
    }

    @Override
    public String turnOn(int currentVoltage) throws ComputerTurnOnException {
        if (currentVoltage>=volt)
        {
            IsOn = true;
            return "Turn on " + toString();

        }
        else
        {
            IsOn = false;
            throw new  ComputerTurnOnException("The current voltage is too small");
        }
    }


    @Override
    public String turnOff() throws ComputerTurnOffException {
        if (IsOn)
            return "Turn off " + toString();
        else
            throw new ComputerTurnOffException("Computer is already turned off");

    }

    @Override
    public String connect(ConnectionStatus status) {
        if (status == ConnectionStatus.OK && IsOn)
            return "Connected " + toString();
        else
            throw new ComputerConnectionError("Can't connect");

    }

}
