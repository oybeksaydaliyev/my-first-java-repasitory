package lesson_2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter implements Runnable {
    private int sum = 0;

    Lock lock = new ReentrantLock();

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public void counter(){
        setSum(getSum()+1);
    }

    @Override
    public void run() {
        lock.lock();
        counter();
        System.out.println(getSum());
        lock.unlock();
    }
}

class Main{
    public static void main(String[] args) {
        Counter counter = new Counter();

        Thread th1 = new Thread(counter);
        Thread th2 = new Thread(counter);

        th1.start();
        th2.start();
    }
}
