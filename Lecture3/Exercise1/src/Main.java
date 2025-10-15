import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int count = 0;
        while (count < 10) {

            int num = random.nextInt(100) + 1;
            System.out.println("Num" + num);
            count++;

        }
        int num;
        do {
            num = random.nextInt(500) + 1;
            System.out.println("Num: " + num);
        } while (num <= 300);


        int countEven = 0;
        for (int i = 0; i < 20; i++) {
            int num2 = random.nextInt(500) + 1;
            System.out.println("Num generated: " + num2);
            if (num2 % 2 == 0) {
                countEven++;
            }

        }
        System.out.println("Number if even numbers is:" + countEven);

        while (true) {
            int num2 = random.nextInt(100) + 1;
            System.out.println("Num" + num);
            if (num2 % 7 == 0) {
                break;
            }

        }
    }
}