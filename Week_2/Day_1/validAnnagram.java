public class validAnnagram{
    public boolean isAnnagram(String s, String t){
        int n=s.length(), m= t.length();
        if(n!=m) return false;
        int [] count=new int[26];
        for(int i=0;i<n;i++){
            count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++){
            if(count[i]!=0) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        validAnnagram v= new validAnnagram();
        String s= "anagram", t= "nagaram";
        System.out.println(v.isAnnagram(s, t));
    }
}