public class Elf implements MagicalCreature, Guardian, Healer{

    private String name;
    private String treasure;
    private int healtPower;

    public Elf ( String name, String treasure, int healtPower ) {
        this.name = name;
        this.treasure = treasure;
        this.healtPower = healtPower;
    }

    @Override
    public void guardTreasure () {

    }

    @Override
    public void healPlayer ( int healthPoints ) {
        System.out.println("");
    }

    @Override
    public void interact () {
        System.out.println("Interacting with elf...");
    }
}
