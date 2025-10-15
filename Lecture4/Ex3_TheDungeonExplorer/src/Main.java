public class Main {
    public static void main ( String[] args ) {
        Room[] creatures = new Room[5];
        for (int i = 0; i < creatures.length; i++) {
            creatures[i] = new Room();
        }

        Player player1 = new Player(50, 100);

        for (int i = 0; i < creatures.length; i++) {
            System.out.println("Entering room with id: " + (i+1));
            boolean result = player1.fight(creatures[i]);

            if(result){
                System.out.println("The player passed the current room " + (i+1));
            }else{
                System.out.println("Game Over!");
                break;
            }
        }
    }
}