package lesson_6;

import java.sql.Time;
import java.time.LocalTime;
import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class SimpleTODO {
    static HashMap<LocalTime, String> note = new HashMap<>();

    public static void main(String[] args) throws InterruptedException {
        addToNote();
        while (true){
            if (checkTime()!=null) {
                System.out.println(checkTime());
                TimeUnit.MINUTES.sleep(1);
            }
        }
    }

    static void addToNote(){
        note.put(LocalTime.of(22,32),"read a book");
        note.put(LocalTime.of(22,34),"do Homework");
        note.put(LocalTime.of(22,33),"Watch TW");
        note.put(LocalTime.of(22,35),"Sleep");
    }

    static String checkTime(){
        return note.get(LocalTime.of(LocalTime.now().getHour(),LocalTime.now().getMinute()));
    }
}
