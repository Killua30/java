public class Monoblock extends Desktop {
    Monitor monitor = new Monitor();
    public void setMonitor (String a, String b){
        monitor.res=a;
        monitor.color=b;

    }
    public String accept(Visitor visitor) {
        return visitor.visitMonoblock(this);
    }
    public String turnOn() {
        return "Turn on "+getClass().getSimpleName()+" "+maker+" "+model+" with processor "+proc+ ", disk "+disk +" ,RAM "+ozu+monitor.getMonitor()+toString();
    }

    public String turnOff() {
        return "Turn off "+getClass().getSimpleName()+" "+maker+" "+model+" with processor "+proc+ ", disk "+disk +" ,RAM "+ozu+monitor.getMonitor()+toString();
    }

    public String connect() {
        return "Connect to internet "+getClass().getSimpleName()+" "+maker+" "+model+" with processor "+proc+ ", disk "+disk +" ,RAM "+ozu+monitor.getMonitor()+toString();
    }
}