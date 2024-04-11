package lesson_4;

import java.util.concurrent.*;

public class TaskWithExecutor {
    public static void main(String[] args) {
        taskWithRunnable();
    }

    static void taskWithRunnable(){
        ExecutorService executorService = Executors.newCachedThreadPool();
        Runnable runnable = ()->{
            System.out.println("Task with Runnable");
            for (int i = 0; i < 5; i++) {
                System.out.println(i);
            }
        };
        executorService.execute(runnable);
        executorService.shutdown();
    }
    static String taskWithCallable() throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        Callable callable = ()->{
            System.out.println("Task with Callable");
            for (int i = 0; i < 5; i++) {
                System.out.println(i);
            }
            return "202";
        };
        Future future = executorService.submit(callable);
        return (String) future.get();
    }
}