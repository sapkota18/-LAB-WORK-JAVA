class thread1 extends  Thread {
    @Override
    public void run()
    {
        for( int i=10;i>0;i--)
        {
            System.out.print(i+" ");
        }
    }
}
class thread2 implements Runnable{
    @Override
    public void run()
    {
        for(int i=65; i<=90; ++i)
        System.out.print((char)i+" "); 
    }
}
public class ThreadExample {
    public static void main(String[] args) {
        thread1 obj=new thread1();
        thread2 ob=new thread2();
        Thread t=new Thread(ob);
        obj.start();
        t.start();    
    }
}
