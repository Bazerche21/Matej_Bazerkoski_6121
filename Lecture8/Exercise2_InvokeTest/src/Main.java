import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main {
    public static void main ( String[] args ) {

        try {
            Test test = new Test();
            Class obj = test.getClass();

            System.out.println("Class name:" + obj.getName());
            System.out.println("Class modifier: " + Modifier.toString(obj.getModifiers()));

            Constructor[] constructors = obj.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                System.out.println("Constructor name: " + constructor.getName());
                System.out.println("Modifier: " + Modifier.toString(constructor.getModifiers()));
            }

            Method method1Invoke = obj.getMethod("method1");
            method1Invoke.invoke(test);

            Method method2Invoke = obj.getMethod("method2", int.class);
            method2Invoke.invoke(test, 5);

            Method method3Invoke = obj.getDeclaredMethod("method3");
            method3Invoke.setAccessible(true);
            method3Invoke.invoke(test);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}