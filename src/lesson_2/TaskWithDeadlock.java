package lesson_2;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TaskWithDeadlock {
    private int amount = 0;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}

class Test {
    public static void main(String[] args) {
        TaskWithDeadlock taskWithDeadlock = new TaskWithDeadlock();
        Lock lock = new ReentrantLock();

        Condition condition = lock.newCondition();

        Thread thread = new Thread(()->{
            try {
                if (taskWithDeadlock.getAmount()<500)
                    condition.await();

                System.out.println("Succesfull!!!");
                condition.signalAll();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
        Thread thread2 = new Thread(()->{
            try {
                if (taskWithDeadlock.getAmount()<500)
                    condition.await();

                System.out.println("Succesfull!!!");
                condition.signalAll();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
    }
}
