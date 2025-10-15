public class Main {
    public static void main ( String[] args ) {
        Hero hero1 = new Hero(50, 100);

        System.out.println("Initial hero status");
        hero1.displayStats();
        hero1.takeDamage(70);
        hero1.powerUp(50);
        System.out.println("Updated hero status");
        hero1.displayStats();
    }
}