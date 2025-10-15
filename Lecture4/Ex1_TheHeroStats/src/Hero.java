public class Hero {
    private int strenght;
    private int health;

    public Hero(int strenght, int health) {
        this.strenght = strenght;
        this.health = health;
    }
    public void displayStats() {
        System.out.println("Hero details: ");
        System.out.println("strenght: " + strenght);
        System.out.println("health: " + health);
    }
    public void takeDamage(int damage) {
        System.out.println("Taking damage: " + damage);
        if (damage >= health) {
            System.out.println("Good bye");
        }
        this.health = this.health - damage;
    }

    public void powerUp(int power){
        System.out.println("Adding power " + power);
        this.strenght = strenght + power;
    }
}
