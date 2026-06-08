public class validPalindrome{
    public boolean isPalindrome(String s) {
        StringBuilder str= new StringBuilder();
       for(int i=0;i<s.length();i++){
           char ch= s.charAt(i);
           if(Character.isLetterOrDigit(ch)) {
              int asci= (int)ch;
              if(asci>= 65 && asci <= 90){
                asci += 32;
                char dh= (char)asci;
                str.append(dh);
            }
            else str.append(ch);              
          }
       }
       int i=0,j= str.length()-1;
        while(i<=j){
            if (str.charAt(i) != str.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    public static void main(String[] args) {
        validPalindrome obj= new validPalindrome();
        String s= "A man, a plan, a canal: Panama"; 
        System.out.println(obj.isPalindrome(s));
    }
}