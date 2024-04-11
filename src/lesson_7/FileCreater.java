package lesson_7;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;

public class FileCreater {
    public static void main(String[] args) {
        creatFile("src/util/testFile.txt");
        writer("Hello World","src/util/testFile.txt");
        reader("src/util/testFile.txt");
    }

    public static void creatFile(String path){
        try {
            new File(path).createNewFile();
            System.out.println("File Created");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public static void writer(String text,String path){
        File file = new File(path);
        try (FileWriter fileWriter = new FileWriter(file)){
            fileWriter.write(text);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void reader(String filePath) {
        Path path = Path.of(filePath);
        try {
            System.out.println(Files.readString(path));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
