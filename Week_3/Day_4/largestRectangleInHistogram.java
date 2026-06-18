import java.util.*;
public class largestRectangleInHistogram{
    public int largestRectangleArea(int[] heights) {
        int n= heights.length;
        Stack<Integer> st= new Stack<>();
        int [] nse= new int[n];
        int [] pse= new int[n];
        // calculating next smaller element;
        st.push(n-1);// pushing only indexes not elements;
        nse[n-1]=n;
        for(int i=n-2;i>=0;i--){
            while(st.size()>0 && heights[st.peek()] >=heights[i]) st.pop();
            if(st.size()==0) nse[i]=n;
            else nse[i]= st.peek();
            st.push(i);
        }
        // making stack empty;
        while(st.size()>0) st.pop();
        // calculating previous smaller elements;
        st.push(0);
        pse[0]=-1;
        for(int i=1;i<=n-1;i++){
            while(st.size()>0 && heights[st.peek()] >= heights[i]) st.pop();
            if(st.size()==0) pse[i]=-1;
            else pse[i]=st.peek();
            st.push(i);
        }
        // finding maximum area
        int max=-1;
        for(int i=0;i<n;i++){
            int area= heights[i]*(nse[i]-pse[i]-1);
            max= Math.max(max,area);
        }
        return max;
    }
    public static void main(String[] args) {
        largestRectangleInHistogram t= new largestRectangleInHistogram();
        int ans[]= {1,3,4,9,8,12,56};
        System.out.println(t.largestRectangleArea(ans));
    }
}