package third;

public class PC extends Desktop {
    String videocard;

    public PC(String maker, String model, String proc, String ram, String disk, String videocard) {
        super(maker, model, proc, ram, disk);
        this.videocard = videocard;
        volt=220;
    }

    @Override
    public String toString() {
        return "PC{" +
                "maker=" + getMaker() +
                ", model=" + getModel() +
                ", proc=" + getProc() +
                ", RAM=" + getRam() +
                ", hard drive=" + getDisk() +
                ", videocard=" + videocard +
                '}';
    }


}
