import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Cat("Whiskers", "Cat", "White"));
        animals.add(new Dog("Buddy", "Dog", "Husky"));
        animals.add(new Dog("Max", "Dog", "Maltese"));

        for (Animal animal : animals) {
            animal.displayInfo();
            animal.makeSound();
        }
    }
}