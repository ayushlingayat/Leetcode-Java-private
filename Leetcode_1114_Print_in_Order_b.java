import java.util.concurrent.Semaphore;

public class Leetcode_1114_Print_in_Order_b {

    Semaphore a,b;

    public Leetcode_1114_Print_in_Order_b() {
        a= new Semaphore(0);
        b= new Semaphore(0);
    }

    public void first(Runnable printFirst) throws InterruptedException {
        
        // printFirst.run() outputs "first". Do not change or remove this line.
        
        printFirst.run();
        a.release();
        
    }

    public void second(Runnable printSecond) throws InterruptedException {
        
        // printSecond.run() outputs "second". Do not change or remove this line.
        a.acquire();
        printSecond.run();
        b.release();
    }

    public void third(Runnable printThird) throws InterruptedException {
        
        // printThird.run() outputs "third". Do not change or remove this line.
        b.acquire();
        printThird.run();
    }
}