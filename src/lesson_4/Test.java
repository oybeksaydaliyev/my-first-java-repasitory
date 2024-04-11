package lesson_4;

import java.util.concurrent.*;

public class Test {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<String> callable = ()->{
            return "204";
        };
        ExecutorService executorService = Executors.newCachedThreadPool();

        Future<String> f1 = executorService.submit(callable);

        if (f1.get().equals("202")) {
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }
}
