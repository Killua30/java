public class MyClock  extends Thread {
    @Override
    public void run() {
        int i = 0;
        while ( true) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (i % 2 == 0) {
                System.out.println("Tik");
                i++;
            } else {
                System.out.println("Tak");
                i++;
            }
            if(!Main.a)break;
        }

    }
}


