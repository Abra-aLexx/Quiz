import java.util.Arrays;

public class TransposeMatrix {

    public static void main(String[] args) {
        transpose();
    }
    static void transpose(){
        int [][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(Arrays.deepToString(matrix));
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i+1; j < matrix.length; j++) {
                int val = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = val;
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }
}
