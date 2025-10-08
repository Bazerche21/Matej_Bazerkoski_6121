import java.util.Random;
import java.util.random.RandomGenerator;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();

        char[][] matrix = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int num = random.nextInt(100);
                if(num%2 == 0){
                    matrix[i][j] = 'O';
                }
                else{
                    matrix[i][j] = 'X';
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
                System.out.println("Test");
            }
            System.out.println();
        }

        String result = announceWinner(matrix);
        if(result.equalsIgnoreCase("X") || result.equalsIgnoreCase("O")){
            System.out.println("The winner is " + result);
        } else{
            System.out.println();
            System.out.println(result);
        }
    }

    public static String anounceWinner(char[][] matrix){
        for (int i = 0; i < 3; i++) {
            if(matrix[i][0] == matrix[i][1] && matrix[i][1] == matrix[i][2])
            {
                return String.valueOf(matrix[i][0]);
            }
        }
        for (int j = 0; j< 3; j++) {
            if(matrix[0][j] == matrix[1][j] && matrix[1][j] == matrix[2][j])
            {
                return String.valueOf(matrix[0][j]);
            }
        }
        if(matrix[0][0] == matrix[1][1] && matrix[1][1] == matrix[2][2]){
            return String.valueOf(matrix[0][0]);
        }
        if(matrix[0][2] == matrix[1][1] && matrix[1][1] == matrix[2][0]){
            return String.valueOf(matrix[0][0]);
        }
        return "No winner";
    }
}