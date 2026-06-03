public class SquareOfSorted{
    public int[] sortedSquare(int []nums){
        int n= nums.length;
        if(n==1) return new int[]{nums[0]*nums[0]};
        int []ans= new int[n];
        int left=0, right=n-1, k=n-1;
        while(left<=right){
            if(Math.abs(nums[right])>Math.abs(nums[left])){
                ans[k--]= nums[right]*nums[right];
                right--;
            }
            else {
             ans[k--]=nums[left]*nums[left];
             left++;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        SquareOfSorted s= new SquareOfSorted();
        int []nums= {-7,-3,-2,2,3,11};
        int []ans= s.sortedSquare(nums);
        for(int i=0;i<ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}