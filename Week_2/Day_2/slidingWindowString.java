import java.util.*;
public class slidingWindowString{
    public int lengthOfLongestSubstring1(String s) {
        int n= s.length();
        int  maxlen=0;
        for(int left=0;left<n;left++){
            int [] seen= new int[256];
            Arrays.fill(seen,0);
          for(int right=left;right<n;right++){
            if(seen[s.charAt(right)]==1) break;
            maxlen=Math.max(maxlen, right-left+1);
            seen[s.charAt(right)]=1;
           }
        }
        return maxlen;
    }
    public int lengthOfLongestSubstring2(String s) {
        int n = s.length();
        int left = 0, maxlen = 0;
        Map<Character, Integer> mp = new HashMap<>();     
        for (int right = 0; right < n; right++) {
            char c = s.charAt(right);         
            // If character already seen, move left pointer
            if (mp.containsKey(c) && mp.get(c) >= left) {
                left = mp.get(c) + 1;
            }       
            // Update last seen index of character
            mp.put(c, right);
            // Update max length
            maxlen = Math.max(maxlen, right - left + 1);
        }  
        return maxlen;
      }
      public int lengthOfLongestSubstring3(String s) {
        int n= s.length();
        int  maxlen=0;
        for(int left=0;left<n;left++){
            int [] seen= new int[256];
            Arrays.fill(seen,0);
          for(int right=left;right<n;right++){
            if(seen[s.charAt(right)]==1) break;
            maxlen=Math.max(maxlen, right-left+1);
            seen[s.charAt(right)]=1;
           }
        }
        return maxlen;
    }
    public static void main(String[] args) {
        slidingWindowString obj= new slidingWindowString();
        String s="abcabcbb";
        int result1=obj.lengthOfLongestSubstring1(s);
        int result2=obj.lengthOfLongestSubstring2(s);
        int result3=obj.lengthOfLongestSubstring3(s);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(+result3);
    }
}