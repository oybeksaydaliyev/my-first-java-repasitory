package lesson_7;

import java.io.*;

public class SrAndDsExample {
    public static void main(String[] args) {
        Employe employe = new Employe("Oybek", "17");
        try(ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("src/util/file.txt"))) {
            output.writeObject(employe);
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }

        try(ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("src/util/file.txt"))){
            System.out.println((Employe) objectInputStream.readObject());
        } catch (IOException | ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

    }
}
