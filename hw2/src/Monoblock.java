
public class Monoblock extends Desktop {
    Monitor monitor;
    public Monoblock(String maker, String model, String proc, String ram, String disk, Monitor monitor) {
        super(maker, model, proc, ram, disk);
        this.monitor = monitor;
    }

    @Override
    public String toString() {
        return "Monoblock{" +
                "maker=" + getMaker() +
                ", model=" + getModel() +
                ", proc=" + getProc() +
                ", RAM=" + getRam() +
                ", hard drive=" + getDisk() +
                ", monitor=" + monitor.hd +
                '}';
    }
}
