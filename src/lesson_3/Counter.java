package lesson_3;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter {
    private int sum;

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public int counter(){
        setSum(getSum()+1);
        return sum;
    }
}
