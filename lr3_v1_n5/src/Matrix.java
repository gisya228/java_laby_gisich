import java.util.concurrent.ThreadLocalRandom;
public class Matrix{
    int colNum;
    int rowNum;
    int[][] matrix;
    public void output(){
        for (int i = 0; i < rowNum; i++){
            for (int j = 0; j < colNum; j++){
                System.out.print(matrix[i][j] + "    ");
            }
            System.out.println();
        }
    }
    private void init() {
        for (int i = 0; i < rowNum; i++) {
            for (int j = 0; j < colNum; j++) {
                matrix[i][j] = ThreadLocalRandom.current().nextInt(50 * (-1), 50 + 1);
            }
        }
    }
    public Matrix(int col, int row){
        colNum = col;
        rowNum = row;
        matrix = new int[rowNum][colNum];
        init();
    }
    public Matrix(int colRow) {
        colNum = colRow;
        rowNum = colRow;
        init();
    }

}