import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int[] a = new int[15];

        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(100);
        }
        int numbersDivisibleBy3 = 0;
        for (int elem: a) {
            if(elem %3 == 0){
                numbersDivisibleBy3++;
            }
            System.out.println(elem + " ");
        }
        System.out.println();
        System.out.println("Numbers of elements divisble by 3: " + numbersDivisibleBy3);

        int[] b = new int[15];
        for (int i = 0; i < b.length; i++) {
            b[i] = 100 - a[i];
        }

        for (int elem: b) {
            System.out.print(elem + " ");
        }
    }
}