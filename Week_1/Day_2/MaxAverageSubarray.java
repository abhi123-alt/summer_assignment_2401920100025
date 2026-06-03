public class MaxAverageSubarray{
    public double findmax(int nums[],int k){
    int n=nums.length, sum=0;
    // average of first window
    for(int i=0;i<k;i++){
        sum+=nums[i];
    }
    // sliding window approach
    double max= sum/k;
    for(int i=k;i<n;i++){
        sum+=nums[i]-nums[i-k];
        max=Math.max(max, (double)sum/k);
    }
    return max;
}
    public static void main(String[] args) {
        MaxAverageSubarray mas = new MaxAverageSubarray();
        int []nums1 = {1,12,-5,-6,50,3};
        int k1 = 4;
        System.out.println(mas.findmax(nums1, k1));
    }
}