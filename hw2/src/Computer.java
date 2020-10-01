
public class Computer implements Comp {
    private String maker;
    private String model;
    private String proc;
    private String ram;
    private String disk;

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
    public String turnOn() {
        return "turnOn:" + toString();
    }

    @Override
    public String turnOff() {
        return "turnOff:" + toString();
    }

    @Override
    public String connect() {
        return "connect:" + toString();
    }

}
