public class SpeedHero extends SuperHero{

    public SpeedHero ( String heroName ) {
        super(heroName);
    }

    @Override
    public void fight () {
        System.out.println(getHeroName() + "makes fast movements and avoid attacks");
    }
}
