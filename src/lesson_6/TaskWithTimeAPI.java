package lesson_6;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.concurrent.TimeUnit;

public class TaskWithTimeAPI {
    public static void main(String[] args) throws InterruptedException {
        while (true){
            TimeUnit.MINUTES.sleep(1);
            System.out.println(LocalTime.now());
        }
    }

//    static LocalDate methodWithLocalDate(String format){
//        LocalDate.parse(format);
//        return LocalDate.now();
//    }
//    public static void main(String[] args) {
//        System.out.println("Local Date Time ->" + nowLDTMethod());
//        System.out.println("Local Date ->" + nowLDMethod());
//        System.out.println("Local Time ->" + nowLTMethod());
//        System.out.println("Instant ->" + nowInstantMethod());
//
//    }
//
//    static LocalDateTime nowLDTMethod(){
//        return LocalDateTime.now();
//    }
//
//    static LocalTime nowLTMethod(){
//        return LocalTime.now();
//    }
//
//    static LocalDate nowLDMethod(){
//        return LocalDate.now();
//    }
//
//    static Instant nowInstantMethod(){
//        return Instant.now();
//    }
}
