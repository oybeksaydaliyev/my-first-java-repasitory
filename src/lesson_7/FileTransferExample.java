package lesson_7;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileTransferExample {
    public static void main(String[] args) {
        transfer("src/util/testFile.txt","src/util/test.txt");
    }

    public static void transfer(String transferFile,String inputFile){
        try {
            //read text
            Path path = Path.of(transferFile);
            String data = Files.readString(path);

            //creat new file
            Path target = Path.of(inputFile);

            //copy data
            Files.copy(path,target);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
