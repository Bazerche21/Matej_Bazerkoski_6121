import javax.imageio.IIOException;
import java.io.*;

public class StudentFileSteam {
    public void printData(Student student) {
        System.out.println("Name: " + student.name);
        System.out.println("Student phone number: " + student.phoneNum);
        System.out.println("Student record num: " + student.recordNumber);
        System.out.println("Student student index: " + student.indexNumber);
    }
    public void writeToFile(Student student, String fileName){
        try{
            FileOutputStream fileOutputStream = new FileOutputStream(fileName);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(student);
            System.out.println("Object serialized, before deserialization: ");
            printData(student);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public Student readFromFile(String fileName){
        Student student = new Student();
        try {
            FileInputStream fileInputStream = new FileInputStream(fileName);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            student = (Student) objectInputStream.readObject();
            System.out.println("After  deserialized: ");
//            printData(student);
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
        return student;
    }
}
