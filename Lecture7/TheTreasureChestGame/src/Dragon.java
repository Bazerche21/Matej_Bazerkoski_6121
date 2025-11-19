public class Dragon implements MagicalCreature, Guardian, Curser{

    private String name;
    private String treasure;
    private int curseDamage;

    public Dragon ( String name, String treasure, int curseDamage ) {
        this.name = name;
        this.treasure = treasure;
        this.curseDamage = curseDamage;
    }

    @Override
    public void castCurse ( int damagePoints ) {
        System.out.println("Dragon " + name + "makes curse with damage: " + damagePoints);
    }

    @Override
    public void interact () {
        System.out.println("Getting in interaction with the dragon: " + name);
    }

    @Override
    public void guardTreasure () {
        System.out.println("Dragon " + name + "guards the treasure : " + treasure);
    }
}
