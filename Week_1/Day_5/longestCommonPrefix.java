public class longestCommonPrefix{
     public String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        if (n == 1) return strs[0];
        int m = strs[0].length();
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < m; i++) {
            char c = strs[0].charAt(i);
            for (int j = 1; j < n; j++) {
                // Stop if index exceeds current string length OR mismatch found
                if (i >= strs[j].length() || strs[j].charAt(i) != c) {
                    return ans.toString();
                }
            }
            ans.append(c);
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        longestCommonPrefix obj= new longestCommonPrefix();
        String[] strs= {"flower","flow","flight"};
        System.out.println(obj.longestCommonPrefix(strs));
    }
}