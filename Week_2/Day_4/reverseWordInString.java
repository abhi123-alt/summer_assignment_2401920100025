public class reverseWordInString{
    private void reverse(StringBuilder m, int x, int y){
      while(x<y){
            char temp= m.charAt(x);
             m.setCharAt(x,m.charAt(y));
             m.setCharAt(y,temp);
             x++;
             y--;
        }
    }
    public String reverseWords(String s) {
        int n= s.length();
        StringBuilder m= new StringBuilder(s);
        int st=0,end=1;
        while(end<n){
            int temp= m.charAt(end);
          if(temp!=32 && end<n-1) end++;
          else if(end==n-1) {
            reverse(m,st,end);
            return m.toString();
          }
          else{
            reverse(m,st,end-1);
             end++;
            st=end;
          }

        }
        return m.toString();
    }
    public static void main(String[] args) {
        reverseWordInString obj= new reverseWordInString();
        String s= "Hello World";
        System.out.println(obj.reverseWords(s));
    }
}