package lesson_5;

import java.sql.Time;
import java.util.Random;
import java.util.concurrent.*;

public class ComplatableFutureExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Random random = new Random();
        CompletableFuture.runAsync(()->{
            for (int i = 0; i < 5; i++) {
                int add = Calculator.add(random.nextInt(121), random.nextInt(56));
                System.out.println(Calculator.subtraction(add, random.nextInt(56)));
            }
        });
    }
}
