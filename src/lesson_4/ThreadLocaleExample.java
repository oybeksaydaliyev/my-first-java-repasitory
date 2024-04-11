package lesson_4;

import java.util.concurrent.*;

public class ThreadLocaleExample {
    private static final ThreadLocal<String> thr = ThreadLocal.withInitial(String::new);

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<String> callable = ()->{
            thr.set("New User");
            return thr.get();
        };

        ExecutorService executorService = Executors.newCachedThreadPool();
        Future<String> future = executorService.submit(callable);

        System.out.println(future.get());
    }
}
