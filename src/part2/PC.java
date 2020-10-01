package part2;

public class PC extends Desktop {
 String video;
 public void setVideo(String a){
     video=a;
 }
    public String turnOn() {
        return "Turn on "+getClass().getSimpleName()+" "+maker+" "+model+" with processor "+proc+ ", disk "+disk +" ,RAM "+ozu+" ,videocard "+video+ " "+toString();
    }

    public String turnOff() {
        return "Turn off "+getClass().getSimpleName()+" "+maker+" "+model+" with processor "+proc+ ", disk "+disk +" ,RAM "+ozu+" ,videocard "+video+ " "+toString();
    }

    public String connect() {
        return "Connect to internet "+getClass().getSimpleName()+" "+maker+" "+model+" with processor "+proc+ ", disk "+disk +" ,RAM "+ozu+" ,videocard "+video+ " "+toString();
    }
}
