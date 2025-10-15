import java.util.Random;

public class Room {
    int creatureStrength;
    int creatureHealth;

    public int getCreatureStrength () {
        return creatureStrength;
    }

    public void setCreatureStrength ( int creatureStrength ) {
        this.creatureStrength = creatureStrength;
    }

    public int getCreatureHealth () {
        return creatureHealth;
    }

    public void setCreatureHealth ( int creatureHealth ) {
        this.creatureHealth = creatureHealth;
    }

    public Room () {
        Random random = new Random();
        creatureStrength = random.nextInt(50);
        creatureHealth = random.nextInt(100);
    }

    public void displayStats(){
        System.out.println("Creature status: ");
        System.out.println("Creature strength: " + creatureStrength);
        System.out.println("Creature health: " + creatureHealth);
    }
}
