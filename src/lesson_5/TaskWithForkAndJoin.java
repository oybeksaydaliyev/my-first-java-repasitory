package lesson_5;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveAction;

public class TaskWithForkAndJoin {
    public static void main(String[] args) {
        ForkJoinPool forkJoinPool = new ForkJoinPool();
        RecursiveTaskTest recursiveTaskTest = new RecursiveTaskTest();
        forkJoinPool.invoke(recursiveTaskTest);
    }
}

class RecursiveTaskTest extends RecursiveAction{
    @Override
    protected void compute() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Hello World");
        }
    }
}

