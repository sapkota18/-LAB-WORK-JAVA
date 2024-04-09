class MultiplicationTable{
    public synchronized void printTable(int n){
        for(int i = 1; i <= 10; i++) {
            System.out.print(n + "*" + i + "=" + (n * i));
            try {
                Thread.sleep(400);
            } catch(Exception e) {
                System.out.println(e);
            }
        }
    }
}

class ThreadA extends Thread {
    MultiplicationTable t;
    ThreadA(MultiplicationTable t) {
        this.t = t;
    }
    public void run() {
        t.printTable(6);
    }
}

class ThreadB extends Thread {
    MultiplicationTable t;
    ThreadB(MultiplicationTable t) {
        this.t = t;
    }
    public void run() {
        t.printTable(9);
    }
}

public class SynchronizationExample {
    public static void main(String[] args) {
        MultiplicationTable obj = new MultiplicationTable();
        ThreadA t1 = new ThreadA(obj);
        ThreadB t2 = new ThreadB(obj);
        t1.start();
        t2.start();
    }
}
