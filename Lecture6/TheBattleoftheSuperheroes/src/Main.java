public class Main {
    public static void main ( String[] args ) {
        SuperHero[] superHeroes = new SuperHero[5];
        superHeroes[0] = new FlyingHero("SkyMaster");
        superHeroes[1] = new SpeedHero("Viktor");
        superHeroes[2] = new StrengthHero("Bogdan");

        for (SuperHero sh: superHeroes) {
            sh.fight();
        }
    }
}