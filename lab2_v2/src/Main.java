import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number of string and columns: ");
        int n = in.nextInt();
        int[][] matrix = new int[n][n];
        // инициализация матрицы случайными числами
        System.out.println("First matrix: ");
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                matrix[i][j] = ThreadLocalRandom.current().nextInt(n * (-1), n + 1);
                System.out.print(matrix[i][j] + "    ");
            }
            System.out.println();
        }
        // транспонирование матрицы
        int[][] newMatrix = new int[n][n];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                newMatrix[i][j] = matrix[j][i];
            }
        }
        //определение нормы матрицы
        int matrixNorm = 0;
        for (int i = 0; i < n; i++){
            int k = 0;
            for(int j = 0; j < n; j++){
                k += Math.abs(matrix[j][i]);
            }
            if (k > matrixNorm)
                matrixNorm = k;
        }
        // вывод новой матрицы
        System.out.println("Second matrix: ");
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                System.out.print(newMatrix[i][j] + "    ");
            }
            System.out.println();
        }
        System.out.println("Норма матрицы равна " + matrixNorm);
    }
}