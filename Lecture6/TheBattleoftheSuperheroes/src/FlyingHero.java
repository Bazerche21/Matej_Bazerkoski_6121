public class FlyingHero extends SuperHero{

    public FlyingHero ( String heroName ) {
        super(heroName);
    }

    @Override
    public void fight () {
        System.out.println(getHeroName() + "takes up in the skies and attach from above");
    }
}
