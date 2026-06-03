
import java.util.*;
// using sorting
public class containsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if(nums[i]==nums[i+1]) return true;
        }
        return false;
    }
    public static void main(String[] args) {
        containsDuplicate cd = new containsDuplicate();
        int[] nums1 = {1,2,3,1};
        int []nums2= {1,2,3,4};
        System.out.println(cd.containsDuplicate(nums1));
        System.out.println(cd.containsDuplicate(nums2));

    }
}