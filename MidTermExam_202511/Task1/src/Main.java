import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a positive integer n: ");
        int n = scanner.nextInt();

        int total = 0;

        for (int i = 1; i <= n; i++) {
            if(i % 2 == 0) {
                total += i;
            }
        }
        System.out.println("The sum of the even numbers up to "+ n + " is " + total +".");
    }
}