package part2;

public class Desktop extends Computer {
    public String turnOn() {
        return "Turn on "+getClass().getSimpleName()+" "+maker+" "+model+" with processor "+proc+ ", disk "+disk +" ,RAM "+ozu+" "+toString();
    }

    public String turnOff() {
        return "Turn off "+getClass().getSimpleName()+" "+maker+" "+model+" with processor "+proc+ ", disk "+disk +" ,RAM "+ozu+" "+toString();
    }

    public String connect() {
        return "Connect to internet "+getClass().getSimpleName()+" "+maker+" "+model+" with processor "+proc+ ", disk "+disk +" ,RAM "+ozu+" "+toString();
    }
}
