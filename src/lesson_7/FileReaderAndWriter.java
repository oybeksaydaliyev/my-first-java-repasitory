package lesson_7;

import java.io.*;

public class FileReaderAndWriter {
    public static void main(String[] args) {
        writer("src/util/file.txt","Hello World");
        read("src/util/file.txt");
    }
    public static void read(String filepath){
        File file = new File(filepath);
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Xatolik yuz berdi: " + e.getMessage());
        }
    }

    public static void writer(String filePath,String text) {
        try(BufferedWriter bwrite = new BufferedWriter(new FileWriter(filePath))){
            bwrite.write(text);
        }catch (IOException e ){
            System.out.println(e.getMessage());
        }
    }
}
