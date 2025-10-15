public class Player {
    private int strength;
    private int health;

    public Player ( int strength, int health ) {
        this.strength = strength;
        this.health = health;
    }

    public boolean fight(Room room){
        if(strength > room.getCreatureStrength()){
            return true;
        }else{
            health = health - room.getCreatureStrength();
            if(health > 0){
                System.out.println("The player survived");
                return true;
            }else {
                System.out.println("The player is dead");
                return false;
            }
        }
    }
}
