public class Main {
   public static boolean a = true;
    public static void main(String[] args) {
        MyClock t1 = new MyClock();
        MyRunnable t2 = new MyRunnable();
        MyThread t3 = new MyThread();
        t2.run();
        t3.start();
        t1.start();
        try {
            Thread.sleep(50000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Main.a = false;
    }
}
