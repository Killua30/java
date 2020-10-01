package homework2;

public class Laptop extends  PortComp {

    public Laptop(String maker, String model, String proc, String ram, String disk, homework2.Keyboard Keyboard, homework2.Monitor Monitor) {
        super(maker, model, proc, ram, disk, Keyboard, Monitor);
    }
    @Override
    public String toString() {
        return "Laptop{" +
                "maker=" + getMaker() +
                ", model=" + getModel() +
                ", proc=" + getProc() +
                ", RAM=" + getRam() +
                ", hard drive=" + getDisk() +
                ", Keyboard=" + Keyboard.model +
                ", Monitor=" + Monitor.hd + '}';
    }
}
