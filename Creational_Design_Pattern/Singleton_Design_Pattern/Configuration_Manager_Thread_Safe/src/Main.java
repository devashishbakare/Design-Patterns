public class Main {
    public static void main(String[] args) {
        Runnable task = () -> {
            ThreadSafeConfigurationManager threadSafeConfigurationManager1 = ThreadSafeConfigurationManager.getInstance();
            threadSafeConfigurationManager1.printCurrentInstance();
        };

        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);
        thread1.start();
        thread2.start();
    }
}