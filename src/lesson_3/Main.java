package lesson_3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args){

        List<Integer>synchronizedList = Collections.synchronizedList(new ArrayList<>());


        Thread addThread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                synchronizedList.add(i);
            }
        });

        Thread addThread2 = new Thread(() -> {
            for (int i = 1000; i < 2000; i++) {
                synchronizedList.add(i);
            }
        });


        addThread1.start();
        addThread2.start();

        try {
            addThread1.join();
            addThread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Size of synchronized list: " + synchronizedList.size());
    }
}
