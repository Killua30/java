
public class PortComp extends Computer {
    Keyboard Keyboard;
    Monitor Monitor;
    public PortComp(String maker, String model, String proc, String ram, String disk, Keyboard Keyboard, Monitor Monitor) {
        super(maker, model, proc, ram, disk);
        this.Monitor=Monitor;
        this.Keyboard=Keyboard;
    }


}
