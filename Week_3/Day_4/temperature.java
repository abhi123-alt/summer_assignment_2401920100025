import java.util.*;
public class temperature{
    public int[] dailyTemperatures(int[] temp) {
        Stack<Integer> st=new Stack<>();
        int n= temp.length;
        if(n==1) return new int[]{0};
        int nge[]=new int[n];
        for(int i=n-1;i>=0;i--){
            while(st.size()>0 && temp[i]>=temp[st.peek()]) st.pop();
            if(st.size()==0) nge[i]=-1;
            else nge[i]=st.peek();
            st.push(i);
        }
        for(int i=0;i<n;i++){
            if(nge[i]==-1) nge[i]=0;
            else nge[i]=nge[i]-i;
        }
        return nge;
    }
    public static void main(String[] args) {
        temperature t= new temperature();
        int [] arr= {1,75,28,90,49,9090,74,600,70};
       int []ans= t.dailyTemperatures(arr);
       for(int i=0;i<ans.length;i++){
        System.out.print(ans[i] + " ");
       }
    }
}