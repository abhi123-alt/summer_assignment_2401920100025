public class diagonalSum{
    public static int sum(int [][]mat){
        int n= mat.length, sum=0;
        if(n==1) return mat[0][0];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j || i+j==n-1){
                    sum+=mat[i][j];
                }
            }
        }
        return sum;
    }
    public static int sum2(int [][]mat){
        int n= mat.length, sum=0;
        for(int i=0;i<n;i++){
            sum+=mat[i][i] + mat[i][n-i-1];
        }
        if(n%2==1) sum-=mat[n/2][n/2];
        return sum;
    }
    public static void main(String[] args) {
        int [][]mat = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(sum(mat));
        System.out.println(sum2(mat));
    }
}