public class Main {
    public static void main ( String[] args ) {
        Animal[] zoo = new Animal[5];

        zoo[0] = new Animal("GenericAnimal") {
            @Override
            public void onomatopeia () {
                System.out.println("Default");
            }
        };
        zoo[1] = new Dog("Viktor");
        zoo[2] = new Lion("Simba");
        zoo[3] = new Frog("Freddy");
        zoo[4] = new SaraMountainDog("Sara");

        for (Animal animal:zoo) {
            animal.onomatopeia();
            if(animal instanceof SaraMountainDog){
                ((SaraMountainDog) animal).traits();
            }
        }
    }
}