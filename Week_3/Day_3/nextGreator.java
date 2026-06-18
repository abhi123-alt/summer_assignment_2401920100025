import java.util.*;
public class nextGreator{
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n= nums1.length;
        int []res= new int[n];
        Stack<Integer> st= new Stack<>();
        int m=nums2.length;
        st.push(nums2[m-1]);
        for(int i=0;i<n;i++){
            int left=0;
             while(nums1[i]!=nums2[left]) left++;
             if(left==m-1) res[i]=-1;
            for(int j=m-2;j>=left;j--){
                while(st.size()>0 && st.peek()<nums2[j]){
                    st.pop();
                }
                if(st.size()==0) res[i]=-1;
                else res[i]=st.peek();
                st.push(nums2[j]);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        nextGreator sol= new nextGreator();
        int arr[]={1,5,6,62,9};
        int arr2[]={1,4,6,9,62,7};
       int []ans= sol.nextGreaterElement(arr, arr2);
       for (int idx = 0; idx < ans.length; idx++) {
        System.out.print(ans[idx] + " ");
       }
    }
}