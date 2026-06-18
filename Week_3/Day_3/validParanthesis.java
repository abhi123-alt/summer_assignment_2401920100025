import java.util.*;
public class validParanthesis{
    public boolean isValid(String s) {
        Stack<Character> st= new Stack<>();
        int n= s.length();
        for(int i=0;i<n;i++){
            char ch= s.charAt(i);
            if(ch=='(' || ch=='[' || ch=='{'){
                st.push(ch);
            }
            else{
                if(st.size()==0) return false;
                if(ch==')' && st.peek()!='(') return false;
                if(ch==']' && st.peek()!='[') return false;
                if(ch=='}' && st.peek()!='{') return false;
                st.pop();
            }
        }
       return st.isEmpty();
    }
    public static void main(String[] args) {
        validParanthesis obj= new validParanthesis();
        String s= "({[]})";
        System.out.println(obj.isValid(s));
    }
}