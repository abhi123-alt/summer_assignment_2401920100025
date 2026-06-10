import java.util.*;
class firstUniqueChar{
    public int firstUniqChar(String s) {
        Map<Character,Integer> mp= new HashMap<>();
        int n= s.length();
        for(int i=0;i<n;i++){
            if(mp.containsKey(s.charAt(i))){
               mp.put(s.charAt(i), mp.get(s.charAt(i)) + 1);
            }
            else mp.put(s.charAt(i),1);
        }
        for(int i=0;i<n;i++){
            if(mp.get(s.charAt(i))<=1) return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        firstUniqueChar f= new firstUniqueChar();
        String s= "leetcode";
        System.out.println(f.firstUniqChar(s));
    }
}