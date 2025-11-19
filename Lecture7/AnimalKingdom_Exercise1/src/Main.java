public class Main {
    public static void main ( String[] args ) {
        System.out.println("Welcome to the kingdom " + Animal.KINGDOM_NAME);

        Bird bird = new Bird();
        Lion lion = new Lion();
        Fish fish = new Fish();

        System.out.println("Bird: ");
        bird.sound();
        bird.move();
        bird.sleep();

        System.out.println("Lion: ");
        lion.sound();
        lion.move();
        lion.sleep();

        System.out.println("Fish");
        fish.sound();
        fish.move();
        fish.sleep();
    }
}