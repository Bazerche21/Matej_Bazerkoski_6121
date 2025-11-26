import java.io.*;

public class Main {
    public static void main ( String[] args ) {
        String fileName="test1.txt";
        Example exemple = new Example(5,"vojdan", 20);


        try {
            FileOutputStream fileOutputStream = new FileOutputStream(fileName);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(exemple);
            System.out.println("Object serialized, before deserialization: ");
            print(exemple);

            FileInputStream fileInputStream = new FileInputStream(fileName);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            exemple=(Example) objectInputStream.readObject();
            System.out.println("After  deserialized: ");
            print(exemple);

        }catch (IOException e ){
            e.printStackTrace();

        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }
    }
    public static void print(Example e){
        System.out.println("Name: "+e.name);
        System.out.println("Age: "+e.age);
        System.out.println("Static int: "+ Example.staticInt);
        System.out.println();
    }

}