public class removeDuplicatesFromSorted{
    public static int removeDuplicates(int[] nums) {
        int n=nums.length;
        if(n==1) return 1;
        int left=0,right=1;
        while(right<n){
            if(nums[left]==nums[right]) {
                right++;
                continue;
            }
            else nums[++left]=nums[right++];
        }
        return left+1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 3, 4};
        int newLength = removeDuplicates(nums);
        System.out.println("New length: " + newLength);
        System.out.print("Modified array: ");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}