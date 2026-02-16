package Oops.Multithred;

public class Thread_Demo {
    public static void main(String[] args) {
        worker w1 = new worker();
        w1.start();
        worker w2 = new worker();
        w2.start();
    }
}


class worker extends Thread {
    @Override public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }
}

