class Even extends Thread {
    @Override
    public void run() {
        for (int i = 100; i <= 200; i++) {
            if (i % 2 == 0) {
                System.out.println("Even Thread is Running: " + i);
            }
        }
    }
}

class Odd extends Thread {
    @Override
    public void run() {
        for (int i = 100; i <= 200; i++) {
            if (i % 2 != 0) {
                System.out.println("Odd Thread is Running: " + i);
            }
        }
    }
}

public class EvenOddThread {
    public static void main(String[] args) {
        Even e = new Even();
        Odd o = new Odd();
        e.start();
        o.start();
    }
}
