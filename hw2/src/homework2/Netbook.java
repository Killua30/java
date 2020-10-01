package homework2;

public class Netbook extends PortComp {
    public Netbook(String maker, String model, String proc, String ram, String disk, homework2.Keyboard Keyboard, homework2.Monitor Monitor) {
        super(maker, model, proc, ram, disk, Keyboard, Monitor);
    }
    @Override
    public String toString() {
        return "Netbook{" +
                "maker=" + getMaker() +
                ", model=" + getModel() +
                ", proc=" + getProc() +
                ", RAM=" + getRam() +
                ", hard drive=" + getDisk() +
                ", Keyboard=" + Keyboard.model +
                ", Monitor=" + Monitor.hd + '}';
    }
}
