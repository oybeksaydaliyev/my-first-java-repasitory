package lesson_6;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDateConverter {
    private static final String DATE_FORMAT_PATTERN = "yyyy-MM-dd HH:mm:ss";

    public static Date convertStringToDate(String dateString) throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat(DATE_FORMAT_PATTERN);
        return dateFormat.parse(dateString);
    }

    public static void main(String[] args) {
        String inputDateString = "2024-04-06 15:30:00";

        try {
            Date date = convertStringToDate(inputDateString);


            System.out.println("Parsed Date: " + date);
        } catch (ParseException e) {

        }
    }
}
