class EvenThread implements Runnable {
    public void run() {
        for (int i = 100; i <= 200; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + " : " + i);
            }
        }
    }
}

class OddThread implements Runnable {
    public void run() {
        for (int i = 100; i <= 200; i++) {
            if (i % 2 != 0) {
                System.out.println(Thread.currentThread().getName() + " : " + i);
            }
        }
    }
}

public class EvenOddThread {
    public static void main(String[] args) {
        EvenThread evenThread = new EvenThread();
        OddThread oddThread = new OddThread();

        Thread t1 = new Thread(evenThread, "Even Thread is Running: ");
        Thread t2 = new Thread(oddThread, "Odd Thread is Running: ");

        t1.start();
        t2.start();
    }
}
