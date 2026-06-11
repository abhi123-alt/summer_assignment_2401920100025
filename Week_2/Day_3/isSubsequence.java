public class isSubsequence {
    public boolean isSubSe(String s, String t){
        int i=0, j=0;
        int n= s.length(), m=t.length();
        while(i<n && j<m){
            if(s.charAt(i)==t.charAt(j)){
                i++;
            }
            j++;
        }
        return i==n;
    }
    public static void main(String[] args) {
        isSubsequence obj = new isSubsequence();
        String s = "abc", t = "ahbgdc";
        System.out.println(obj.isSubSe(s, t));
    }
}