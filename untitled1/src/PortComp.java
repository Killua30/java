public class PortComp extends Computer {
    Monitor monitor = new Monitor();
    Keyboard keyboard = new Keyboard();
    public void setMonitor (String a, String b){
        monitor.res=a;
        monitor.color=b;
    }
    public void setKeyboard (String a, String b){
        keyboard.gamer=a;
        keyboard.color=b;
    }
    public String turnOn() {
        return "Turn on "+getClass().getSimpleName()+" "+maker+" "+model+" with processor "+proc+ ", disk "+disk +" ,RAM "+ozu+monitor.getMonitor()+keyboard.getKeyboard()+toString();
    }

    public String turnOff() {
        return "Turn off "+getClass().getSimpleName()+" "+maker+" "+model+" with processor "+proc+ ", disk "+disk +" ,RAM "+ozu+monitor.getMonitor()+keyboard.getKeyboard()+toString();
    }

    public String connect() {
        return "Connect to internet "+getClass().getSimpleName()+" "+maker+" "+model+" with processor "+proc+ ", disk "+disk +" ,RAM "+ozu+monitor.getMonitor()+keyboard.getKeyboard()+toString();
    }
}