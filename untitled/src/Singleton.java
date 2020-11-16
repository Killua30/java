public final class Singleton {
    private static Singleton instance;
    String value;
    static Object lock = "a";

    private Singleton(String value) {
        // Этот код эмулирует медленную инициализацию

            try {
                Thread.sleep(10000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            this.value = value;
    }

    static  Singleton getInstance(String value) {
        synchronized (lock) {
            if (instance == null) {
                instance = new Singleton(value);
            }
            return instance;
        }
    }
}