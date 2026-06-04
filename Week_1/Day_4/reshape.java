public class reshape{
public int[][] matrixReshape(int[][] mat, int r, int c) {
    if (mat == null || mat.length == 0 || mat[0].length == 0) {
        return mat; // handle empty input
    }

    int rows = mat.length;
    int cols = mat[0].length;

    // If reshape not possible, return original
    if (rows * cols != r * c) {
        return mat;
    }

    int[][] result = new int[r][c];
    int m = 0, n = 0;

    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            result[m][n] = mat[i][j];
            n++;
            if (n == c) {
                n = 0;
                m++;
            }
        }
    }

    return result;
}
public static void main(String[] args) {
    reshape reshaper = new reshape();
    int[][] mat = {{1, 2}, {3, 4}};
    int r = 1, c = 4;
    int[][] reshaped = reshaper.matrixReshape(mat, r, c);
    
    for (int i = 0; i < reshaped.length; i++) {
        for (int j = 0; j < reshaped[0].length; j++) {
            System.out.print(reshaped[i][j] + " ");
        }
        System.out.println();
    }
   } 
}