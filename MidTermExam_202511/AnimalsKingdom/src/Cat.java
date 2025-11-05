public class Cat extends Animal{

    private String color;
    public Cat(String name, String species, String color) {
        super(name, species);
        this.color = color;
    }

    @Override
    public void makeSound() {
        System.out.println("Meow.");
    }
}
