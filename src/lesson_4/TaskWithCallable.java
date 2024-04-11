package lesson_4;

import java.util.concurrent.*;

public class TaskWithCallable {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        if (callableMethod().equals("202")) {
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }

    static String callableMethod() throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        Callable<String> callable = ()->{
            System.out.println("Task with Callable");
            for (int i = 0; i < 5; i++) {
                System.out.println(i);
            }
            return "202";
        };
        Future<String> future = executorService.submit(callable);
        return future.get();
    }
}
