import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main {
    public static void main ( String[] args ) {

        try {
            Dog dog = new Dog();
            Class obj = dog.getClass();
            System.out.println("Class name: " + obj.getName());
            int modClass = obj.getModifiers();
            System.out.println("Class Modifier: " + Modifier.toString(modClass));
            System.out.println("Class Parent: " + obj.getSuperclass().getName());

            Method[] methods = obj.getDeclaredMethods();
            for (Method method : methods) {
                System.out.println("Method name: " + method.getName());
                int modMethod = method.getModifiers();
                System.out.println("Method modifier: " + Modifier.toString(modMethod));
                System.out.println("Method return type: " + method.getReturnType());
            }

            Constructor[] constructors = obj.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                System.out.println("Constructor: " + constructor.getName());
                System.out.println("Constructor modifier: " + Modifier.toString(constructor.getModifiers()));
                System.out.println("Constructor parameters count: " + constructor.getParameterCount());

            }

            Field fieldtype = obj.getDeclaredField("type");
            System.out.println("Field name: " + fieldtype.getName());
            System.out.println("Field type modifier: " + Modifier.toString(fieldtype.getModifiers()));
            fieldtype.set(dog, "Labrador");
            System.out.println("Field type value: " + fieldtype.get(dog));

            Field fieldColor = obj.getDeclaredField("color");
            System.out.println("Field name: " + fieldColor.getName());
            System.out.println("Field type modifier: " + Modifier.toString(fieldColor.getModifiers()));
            fieldColor.setAccessible(true);
            fieldColor.set(dog, "Yellow");
            System.out.println("Field color value: " + fieldColor.get(dog));

        }catch (Exception e){
           e.printStackTrace();
        }
    }
}