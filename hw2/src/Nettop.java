public class Nettop extends Desktop {
    public Nettop(String maker, String model, String proc, String ram, String disk) {
        super(maker, model, proc, ram, disk);
    }

    @Override
    public String toString() {
        return "Nettop{"+
                "maker=" + getMaker() +
                ", model=" + getModel() +
                ", proc=" + getProc() +
                ", RAM=" + getRam() +
                ", hard drive=" + getDisk() +
                "}";
    }
}
