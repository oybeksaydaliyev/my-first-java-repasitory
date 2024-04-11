package lesson_7.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {
    public static void main(String[] args) {
        System.out.println("System working !!!");
        System.out.println(findNumbersCount("asd34449v4f4 54 5 fse4 "));
    }

    public static int findNumbersCount(String inputText){
        int count = 0;

        Pattern compile = Pattern.compile("\\d");
        Matcher matcher = compile.matcher(inputText);

        while (matcher.find())
            count++;


        return count;
    }
}
