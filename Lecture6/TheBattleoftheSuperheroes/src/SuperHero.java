public abstract class SuperHero {
    private String heroName;

    public String getHeroName () {
        return heroName;
    }

    public void setHeroName ( String heroName ) {
        this.heroName = heroName;
    }

    public SuperHero ( String heroName ) {
        this.heroName = heroName;
    }

    public abstract void fight();
}
