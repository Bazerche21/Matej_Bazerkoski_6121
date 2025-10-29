public class Main {
    public static void main ( String[] args ) {
        Egg regularEgg = new Egg();
        OstrichEgg ostrichEgg = new OstrichEgg();

        System.out.println("Regular egg details:");
        regularEgg.EGG();
        regularEgg.print();

        System.out.println("Ostrich egg details:");
        ostrichEgg.EGG();
        ostrichEgg.print();
    }
}