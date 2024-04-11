package lesson_7;

import java.io.*;

public class Employe implements Externalizable {
    private String fullName;
    private String age;

    public Employe() {
    }

    public Employe(String fullName, String age) {
        this.fullName = fullName;
        this.age = age;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employe{" +
                "fullName='" + fullName + '\'' +
                ", age='" + age + '\'' +
                '}';
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(this.fullName);
        out.writeObject(this.age);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException{
        this.fullName = (String) in.readObject();
        this.age = (String) in.readObject();
    }
}
