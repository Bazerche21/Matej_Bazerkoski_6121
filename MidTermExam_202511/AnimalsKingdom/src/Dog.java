public class Dog extends Animal{
    private String breed;
    public Dog(String name, String species,String breed ) {
        super(name, species);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Woof!, Woof!.");
    }
}
