public class Server extends  Computer {
    public Server(String maker, String model, String proc, String ram, String disk) {
        super(maker, model, proc, ram, disk);
    }

    @Override
    public String toString() {
        return "Server{" +
                "maker=" + getMaker() +
                ", model=" + getModel() +
                ", proc=" + getProc() +
                ", RAM=" + getRam() +
                ", hard drive=" + getDisk() +
                "}";
    }
}
