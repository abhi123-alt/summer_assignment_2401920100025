class maximum_subarray {
    private int divide(int []nums, int left, int right){
        if(left>=right) return nums[left];
        int mid= left+(right-left)/2;
        int leftSum= divide(nums,left,mid);
        int rightSum= divide(nums,mid+1,right);
        int crossSum=crossSubarray(nums,left,mid,right);
        return Math.max(Math.max(leftSum,rightSum),crossSum);
    }
    private int crossSubarray(int []nums, int left, int mid, int right){
        int leftMax=Integer.MIN_VALUE,sum=0;
        for(int i=mid;i>=left;i--){
            sum+=nums[i];
            leftMax=Math.max(leftMax,sum);
        }
        int rightMax=Integer.MIN_VALUE;
         sum=0;
        for(int i=mid+1;i<=right;i++){
            sum+=nums[i];
            rightMax=Math.max(rightMax,sum);
        }
        return leftMax+rightMax;
    }
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        return divide(nums,0,n-1);
    }
    public static void main(String[] args) {
        maximum_subarray ans= new maximum_subarray();
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int maxSum = ans.maxSubArray(nums);
        System.out.println("Maximum subarray sum: " + maxSum);
    }
}