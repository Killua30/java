package firstandsecond;

public class Log {
    public static void log(String a){
        System.out.println(Thread.currentThread().getStackTrace()[2].getClassName() + ": " +
                Thread.currentThread().getStackTrace()[2].getMethodName() + ": " + a);

    }
    public static void main(String[] args) {
        log("In main method");
    }

}
