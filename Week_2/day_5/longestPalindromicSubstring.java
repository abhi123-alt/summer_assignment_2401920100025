public class longestPalindromicSubstring{
    private boolean palindrome(String s){
        int i=0, j= s.length()-1;
        if(s.length()==1) return true;
        while(i<j){
            if(s.charAt(i)!= s.charAt(j)) return false;
            i++;
            j--;
        }
         return true;
    }
    public String longestPalindrome(String s) {
        int count=0;
        String ans= "";
        for(int i=0;i< s.length();i++){
            for(int j=i+1;j<= s.length();j++){
                String temp= s.substring(i,j);
              if(palindrome(temp) == true){
                 if(temp.length() > count) {
                    ans= temp;
                   count= temp.length();
                 }
            }       
         }
        }
        return ans;
    }
    public static void main(String[] args) {
        longestPalindromicSubstring obj= new longestPalindromicSubstring();
        String s= "babad";
        System.out.println(obj.longestPalindrome(s));
    }
}