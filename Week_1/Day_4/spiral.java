import java.util.*;
public class spiral{
    public List<Integer> spiralOrder(int[][] matrix) {
        int r= matrix.length;
        int c= matrix[0].length;
        ArrayList<Integer> list= new ArrayList<>();
        int toprow=0, buttomrow= r-1, leftcol=0, rightcol= c-1;
        int count=0;
        while(count< r*c){
         for(int j= leftcol;j<=rightcol && count < r*c;j++){
            list.add(matrix[toprow][j]);
            count++;
         }
         toprow++;
         for(int i= toprow; i<=buttomrow && count< r*c; i++){
            list.add(matrix[i][rightcol]);
            count++;
         }
         rightcol--;
        for(int j=rightcol; j>= leftcol && count<r*c; j--){
            list.add(matrix[buttomrow][j]);
            count++;
        }
        buttomrow--;
        for(int i=buttomrow; i>= toprow && count< r*c; i--){
            list.add(matrix[i][leftcol]);
            count++;
        }
        leftcol++;
    }
    return list;
 }
 public static void main(String [] args){
    spiral sp= new spiral();
    int [][] matrix= {{1,2,3},{4,5,6},{7,8,9}};
    List<Integer> res= sp.spiralOrder(matrix);
    for(int num: res){
        System.out.print(num+" ");
    }
 }
}